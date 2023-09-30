public class chessPiece {
    private String color;
    private String name;
    private int x;
    private int y;
    public chessPiece(String color, String name, int x, int y)
    {
            this.color = color;
            this.name = name;
            this.x = x;
            this.y = y;
    }

    public boolean legalMove(int x, int y)//String color, String name, int x, int y)//, int x, int y)
    {
        if (0 < x && x<8 && 0<y && y<8)
        switch(this.name)
        {
            case "king":
            {
                var radiusX = Math.abs(x-this.x);
                var radiusY = Math.abs(x-this.y);
                if(radiusX <= 1 && radiusY <= 1)
                {
                    return true;
                }
            }
                
        }

        return false;
    }
    public void move(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public int getposX()
    {
        return this.x;
    }
    public int getposY()
    {
        return this.y;
    }
}
