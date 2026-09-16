public class tictactoe {
   static public Boolean iswinner(char[]board,char c)
    {
        if(board[0]==c && board[1]==c && board[2]==c ||board[3]==c && board[4]==c && board[5]==c ||board[6]==c && board[7]==c && board[8]==c ||board[0]==c && board[3]==c && board[6]==c ||board[1]==c && board[4]==c && board[7]==c ||board[2]==c && board[5]==c && board[8]==c ||board[0]==c && board[4]==c && board[8]==c ||board[2]==c && board[4]==c && board[6]==c)
        {
            return true;
        }
        return false;
    }
    static public Boolean isvalid(char[] board)
    {
        int xcount=0 , ocount=0;
        for(int i=0 ;i<board.length;i++)
        {
            if(board[i]=='x')
            {
                xcount++;
            }
            else if(board[i]=='o')
            {
                ocount++;
            }
        }
        if(ocount>xcount )
        {
            return false;
        }
        if(ocount!=xcount && ocount!=xcount-1)
        {
            return false;
        }
        if(iswinner(board,'x') && iswinner(board,'o'))
        {
            return false;
        }
    
        if(iswinner(board,'x') && ocount!=xcount-1)
        {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        char[] board={
            'x','o','x',
            'o','x','o',
            'o','x','x'};
        if(isvalid(board))
        {
            System.out.println("Valid");
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}
