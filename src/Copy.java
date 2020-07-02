import java.io.*;

public class Copy {
    public static void main(String[] args) {
        charStreamCopy("e:/a/io/a.txt","e:/a/io/b.txt");

        byteStreamCopy("E:/a/a.jpg","e:/a/io/b.jpg");
    }


    /*
    字符流复制
     */
    public static void charStreamCopy(String inName ,String outName){
        /*
        构造输入文件和输出文件
         */
        File inFile = new File(inName);
        File outFile = new File(outName);

        String line = null;
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new FileReader(inFile));
            bw = new BufferedWriter(new FileWriter(outFile));
            while ((line = br.readLine())!=null){
                bw.write(line);
                bw.newLine();
                bw.flush();
            }

        } catch (IOException e) {
           throw new RuntimeException(e);
        }finally {
            /*
            io流一定要关闭，所以要使用finally关键字，但是br可能是null,
            若br是null不能直接close，这样会导致空指针异常
            另外close也会报出IOException

            为什么一定要关闭io流？
            在内存中的实例对象，当没有引用指向的时候，java垃圾收集器会按照相应的策略自动回收，
            但是却无法对系统资源进行释放
            那么这就引申出另一个考点,垃圾回收机制是什么?什么时候回收垃圾，什么样的垃圾要回收.
             */
            try{
                if(bw != null){
                   bw.close();
                }
            }catch (IOException e){
                throw new RuntimeException();
            }finally {
                try{
                    if(br != null){
                        br.close();
                    }
                }catch (IOException e){
                    throw new RuntimeException();
                }
            }
        }

    }

    /*
    字节流复制
     */
    public static void byteStreamCopy(String inName ,String outName){
        /*
        构造源文件
         */
        File inFile = new File(inName);
        File outFile = new File(outName);
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(new FileInputStream(inFile));
            bos = new BufferedOutputStream(new FileOutputStream(outFile));

            int n = 0;
            byte[] b = new byte[1024];

            /*
            这里一定要注意读取的时候，read参数里面一定要是byte数组，并且这个byte数组参数很容易忘
             */
            while ((n=bis.read(b)) != -1){
                bos.write(b,0,n);
                bos.flush();
            }

            bos.close();
            bis.close();
        }  catch (IOException e) {
            throw  new RuntimeException(e);
        }finally {
            try {
                if(bos != null){
                    bos.close();
                }
            }catch (IOException e){
                throw  new RuntimeException(e);
            }finally {
                try{
                    if(bis != null){
                        bis.close();
                    }
                }catch (IOException e){
                    throw  new RuntimeException(e);
                }
            }
        }
    }
}
