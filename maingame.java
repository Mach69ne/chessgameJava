class main {
    public static void main(String[] args)
    {
        var scanner = new java.util.Scanner(System.in);
        boolean gameActive = true;
        boolean whiteTurn = true;
        chessPiece whiteKing = new chessPiece("white", "king", 1,1);

        // Initiate main game loop
        while (gameActive)
        {
            var moveNotator = scanner.nextLine();
            char pieceName = 'p';
            int x = 0;
            int y = 0;
            if (moveNotator.length() == 3)
            {
                pieceName = moveNotator.charAt(0);
                x  = moveNotator.charAt(1);
                y = moveNotator.charAt(2);
            }
            else if (moveNotator.length()==2)
            {
                x = moveNotator.charAt(0);
                y = moveNotator.charAt(1);
            }
            // minus 48 to get the proper integer value, as their value
            // is currently unicode based
            x -= 48;
            y -= 48;

            System.out.println(pieceName+" "+x+" "+y);


            System.out.println(whiteKing.getposX());
            System.out.println(whiteKing.getposY());
            
            switch (pieceName)
            {
                case 'k':
                {
                    if (whiteKing.legalMove(x, y))
                    {
                        whiteKing.move(x,y);
                    }
                }
            }

            System.out.println(whiteKing.getposX());
            System.out.println(whiteKing.getposY());
        }
    }
}
