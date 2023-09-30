public class chessPiece {
    private String color;
    private String name;
    private int posX;
    private int posY;
    public chessPiece(String color, String name, int posX, int posY)
    {
            this.color = color;
            this.name = name;
            this.posX = posX;
            this.posY = posY;
    }

    public boolean legalMove(int attX, int attY)//String color, String name, int posX, int posY)//, int attX, int attY)
    {
        switch(this.name) 
        {
            case "king":
            {
                System.out.println("dean");
                if( 1 == Math.abs(attX-this.posX) && 1 == Math.abs(attY-this.posY))
                {
                    return true;
                }
            }
                
        }

        return false;
    }
}
