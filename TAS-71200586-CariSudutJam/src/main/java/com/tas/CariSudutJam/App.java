package com.tas.CariSudutJam;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
         CariSudutJam data = new CariSudutJam();
         data.createNewDatabase();
         data.connect();
         data.createNewTable();
         data.update();
    }
}
