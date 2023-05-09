// Thomas Lupinacci's class for the Spring 2023 final project

public class LupinacciMenu implements FinalProject
{
    public LupinacciMenu()
    {

    }

    public void begin()
    {
        System.out.println();
        System.out.println("<3 <3 <3 <3 <3 <3 <3 ");
        System.out.println("     ***   ***       ");
        System.out.println("    ***** *****      ");
        System.out.println("    ***********      ");
        System.out.println("     *********       ");
        System.out.println("      *******        ");
        System.out.println("       *****         ");
        System.out.println("        ***          ");
        System.out.println("         *           ");
        System.out.println("<3 <3 <3 <3 <3 <3 <3 ");
        System.out.println();

        try
        {
            java.util.concurrent.TimeUnit.SECONDS.sleep(2);  
        }
        catch(InterruptedException e)
        {}
    }
}
