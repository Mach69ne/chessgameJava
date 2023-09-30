class main {
    public static void main(String[] args)
    {
        var scanner = new java.util.Scanner(System.in);


        var king = new chessPiece("white", "king", 1,1);
        
        var x = scanner.nextInt();
        var y = scanner.nextInt();

        var legal = king.legalMove(x,y);
        System.out.println(legal);
    }
}
