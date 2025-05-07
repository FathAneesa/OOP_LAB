import java.io.*;

class ShowFile {
    public static void main(String args[]) throws IOException {
        String source = "Hello World";
        byte buf[] = source.getBytes();
        FileInputStream fin;
        int i;
        try
        {
        FileOutputStream fi=new FileOutputStream("file.txt");
        for (i=0;i<buf.length;i++)
        fi.write(buf[i]);
        } catch (IOException e) {
            System.out.println("An I/O Error Occurred during writing");
        }
        try {
        fin=new FileInputStream(args[0]);
            }
            catch (FileNotFoundException e)
           {
           System.out.println("File Not Found");
           return;
           }
           do
           {
           i=fin.read();
           if(i!=-1)
           System.out.print((char)i);
           }while(i!=-1);
        }
      }
