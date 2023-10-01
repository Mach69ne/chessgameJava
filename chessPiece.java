public class chessPiece {
    private boolean white;
    private String name;
    private int x;
    private int y;

    // Constructor of Chess pieces
    public chessPiece(boolean white, String name, int x, int y)
    {
            this.white = white;
            this.name = name;
            this.x = x;
            this.y = y;
    }
    // Check if move is legal or not
    public boolean legalMove(int x, int y)
    {
        if (0 < x && x<8 && 0<y && y<8) {

        //The move patterns are different for every type of piece, we therefore have a switch statement to differentiate between the rules
            switch(this.name)
            {
                case "king":
                {
                    var radiusX = Math.abs(x-this.x);
                    var radiusY = Math.abs(y-this.y);
                    if(radiusX <= 1 && radiusY <= 1)
                    {
                        return true;
                    }
                }
                case "pawn":
                {
                    if (white)
                    {
                        if (y - this.y == 1)
                        {
                            return true;
                        }
                        if (y - this.y == 2 && this.y == 2)
                        {
                            return true;
                        }
                        
                    }
                    if (!white)
                    {
                        if (y-this.y == -1)
                        {
                            return true;
                        }
                    }
                    if (y - this.y == -2 && this.y == 7)
                        {
                            return true;
                        }
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
    private void capture(int x, int y)
    {

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
