/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp_decomp;

import static comp_decomp.compressor.method;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 *
 * @author ASUS
 */
public class decompressor {
        public static void method(File file)throws IOException{
            String fileDirectory = file.getParent();
            
            FileInputStream fis = new FileInputStream(file);
            GZIPInputStream gzip = new GZIPInputStream(fis);
            FileOutputStream fos = new FileOutputStream(fileDirectory+"DecompressedFile");

            
            
            
                    byte[] buffer = new byte[1024];

                    int len;
                     while((len = gzip.read(buffer))!=-1){
            fos.write(buffer, 0, len);
        }
                     
                     gzip.close();
        fos.close();
        fis.close();
            }
        
        
           public static void main(String args[]){
            File path = new File("Users/ASUS/Documents/NetBeansProjects/Compressor_decompressor/CompressedFile.gz");
        }


}
