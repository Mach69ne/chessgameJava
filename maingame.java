class main {
    public static void main(String[] args)
    {
        var scanner = new java.util.Scanner(System.in);

        var whiteKing = new chessPiece("white", "king", 1,1);
        var pieceName = scanner.nextLine();
        var x = scanner.nextInt();
        var y = scanner.nextInt();
        

        


        System.out.println(whiteKing.getposX());
        System.out.println(whiteKing.getposY());
        
        switch (pieceName) 
        {
            case "white king":
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
