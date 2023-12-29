import java.io.*;

public class Main
{

        void write_16x(String name1, String name2) throws IOException
        {
            FileInputStream in = new FileInputStream(name1);
            BufferedWriter out = new BufferedWriter(new FileWriter(name2));

            long bytesNum = 0, lineNum = 0;
            boolean newLine = true;

            int curByte;

            while((curByte = in.read()) != -1)
            {
                if (newLine)
                {
                    out.write(String.format("%08x", lineNum) + "  ");
                    newLine = false;
                }

                out.write(String.format("%02x", curByte) + ' ');
                bytesNum++;

                if (bytesNum % 8 == 0)
                    out.write(' ');

                if (bytesNum % 16 == 0)
                {
                    out.write('\n');
                    lineNum += 16;
                    newLine = true;
                }
            }
            in.close();
            out.close();
        }



    void write_useful_16x(String name1, String name2) throws IOException
    {
        FileInputStream in = new FileInputStream(name1);
        BufferedWriter out = new BufferedWriter(new FileWriter(name2));

        long bytesNum = 0, lineNum = 0;
        boolean newLine = true, useless = false;
        int [] buffer = new int[2];
        buffer[1] = in.read();
        int curByte;

        while((curByte = in.read()) != -1)
        {
            buffer[0] = buffer[1];
            buffer[1] = curByte;

            if((String.format("%02x", buffer[0]) + String.format("%02x", buffer[1])).equals("ffff"))
                useless = true;

            if(!useless)
            {
                    if (newLine)
                    {
                        out.write(String.format("%08x", lineNum) + "  ");
                        newLine = false;
                    }

                    out.write(String.format("%02x", buffer[0]) + ' ');
                    bytesNum++;

                    if (bytesNum % 8 == 0)
                        out.write(' ');

                    if (bytesNum % 16 == 0)
                    {
                        out.write('\n');
                        lineNum += 16;
                        newLine = true;
                    }
            }
            else
            {
                in.skip(4);
                curByte = in.read();
                if(String.format("%02x", curByte).equals("01"))
                    in.skip(25);
                else in.skip(9);

                buffer[1] = in.read();
                useless = false;
            }

        }
        System.out.println("Полезнные записи: " + String.valueOf(bytesNum));
        in.close();
        out.close();
    }



    public static void main(String[] args) throws IOException
    {
        Main test = new Main();
        test.write_16x("190829_v29854.KNP", "rez.txt");
        test.write_useful_16x("190829_v29854.KNP", "rez2.txt");
    }
}
