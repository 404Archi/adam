import greenfoot.*;
public class MyWorld extends World
{
    public void showText(java.lang.String text,int x,int y){}

    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1500, 800, 1); 
        prepare();

    }

    private void prepare()
    {
        Adam adam = new Adam();
        addObject(adam,135,106);
        Eva eva = new Eva();
        addObject(eva,1306,700);
        Drzewo drzewo = new Drzewo();
        addObject(drzewo,1300,165);
        Toaleta toaleta = new Toaleta();
        addObject(toaleta,128,695);
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("k"))
        {
            int szerokosc = getWidth();
            int wysokosc = getHeight();
            String odp = Greenfoot.ask("Ile wonszy mirordzie?");
            int ile=Integer.parseInt(odp);
            if(ile>5)ile=5;
            for(int i = 0; i< ile; i++)
            {
                int x = Greenfoot.getRandomNumber(szerokosc);
                int y = Greenfoot.getRandomNumber(wysokosc);
                Snake snake = new Snake ();
                addObject(snake, x, y);
                while(snake.dotykaAdama())
                {
                    x = Greenfoot.getRandomNumber(szerokosc);
                    y = Greenfoot.getRandomNumber(wysokosc);
                    snake.setLocation(x,y);
                }
                while(snake.dotykaEwe())
                {
                    x = Greenfoot.getRandomNumber(szerokosc);
                    y = Greenfoot.getRandomNumber(wysokosc);
                    snake.setLocation(x,y);
                }
            }
        }
    }
}