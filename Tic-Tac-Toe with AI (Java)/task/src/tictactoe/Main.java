package tictactoe;

import java.util.*;


class TicTacToe{

    Scanner sc;
    int [][] b;
    public void init(){
        sc = new Scanner(System.in);
        b = new int[3][3];
    }
    public void print(){
        for(int i=0;i<9;i++)
        {
            System.out.print("-");
        }
        System.out.println();
        for(int i=0;i<3;i++) {

            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                if (b[i][j] == 1) {
                    System.out.print("X ");
                } else if (b[i][j] == 2) {
                    System.out.print("O ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("|");
        }
        for(int i=0;i<9;i++)
        {
            System.out.print("-");
        }
        System.out.println();
    }

    public int count(){
        int xC = 0;
        int oC = 0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(b[i][j]==1){
                    xC++;
                }
                else if(b[i][j]==2){
                    oC++;
                }
            }

        }
        if(xC==oC)return 1;
        else return 2;
    }

    public int help(){
        boolean flag = false;
        for(int i=0;i<3;i++)
        {
             int cntX=0;
             int cntO = 0;
             for(int j=0;j<3;j++)
             {
                 if(b[i][j]==1)cntX++;
                 else if(b[i][j]==2)cntO++;
                 else flag = true;
             }
             if(cntX==3)return 2;
             else if(cntO==3)return 3;
            cntX=0;
            cntO = 0;
            for(int j=0;j<3;j++)
            {
                if(b[j][i]==1)cntX++;
                else if(b[j][i]==2)cntO++;
                else flag = true;
            }
            if(cntX==3)return 2;
            else if(cntO==3)return 3;

        }
        int cntX =0;
        int cntO=0;
        for(int i=0;i<3;i++)
        {
            if(b[i][i]==1){
                cntX++;
            }
            else if(b[i][i]==2){
                cntO++;
            }
            else{
                flag = true;
            }

        }
        if(cntX==3)return 2;
        else if(cntO==3)return 3;
        cntX =0;
        cntO=0;
        for(int i=0;i<3;i++)
        {
            if(b[2-i][i]==1){
                cntX++;
            }
            else if(b[2-i][i]==2){
                cntO++;
            }
            else{
                flag = true;
            }

        }
        if(cntX==3)return 2;
        else if(cntO==3)return 3;


        return flag ? 0 : 1;
    }
    public void user(){
       try{
           System.out.print("Enter the coordinates: ");
           String[] c = sc.nextLine().split(" ");
           int x = Integer.parseInt(c[0]);
           int y = Integer.parseInt(c[1]);
           x--;
           y--;
           if(x>=3||x<0||y>=3||y<0){
               System.out.println("Coordinates should be from 1 to 3!");
               user();
               return;
           }
           else if(b[x][y] !=0){
               System.out.println("This cell is occupied! Choose another one!");
               user();
               return;
           }
           if(count()==1){
               b[x][y]=1;
           }
           else if(count()==2){
               b[x][y]=2;
           }
       }
       catch(Exception e){
           user();
       }
    }
    public void comp(int symbol,String level){
        System.out.println("Making move level \""+level+"\"");
        int [] c = new int[]{-1,-1};
        if(level.equals("medium")){
            c = win(symbol);
            if(c[0]==-1 && c[1]==-1){
                c = lose(symbol);
            }
        }
        while(true){
            if(c[0]==-1 && c[1]==-1) {
                int p = (int) (Math.random() * 3);
                int q = (int) (Math.random() * 3);
                if (b[p][q] != 0) {
                    continue;
                }
                c[0]=p;
                c[1]=q;
//                System.out.print(p+" "+q);
            }
            break;
        }
        b[c[0]][c[1]] = symbol == 1 ? 1 : 2;
    }
    public int[] win(int symbol){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(b[i][j]!=0)continue;
                b[i][j]=symbol;
                if(help() == (symbol==1?2:3)){
                    b[i][j]=0;
                    return new int[]{i,j};
                }
                b[i][j]=0;
            }
        }
        return new int[]{-1,-1};
    }
    public int[] lose(int symbol){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(b[i][j]!=0)continue;
                b[i][j]=symbol^1;
                if(help() == (symbol==1?3:2)){
                    b[i][j]=0;
                    return new int[]{i,j};
                }
                b[i][j]=0;
            }
        }
        return new int[]{-1,-1};
    }
    public void func1(String level){
        print();
        user();
        int s = help();
        if(s==1){
            print();
            System.out.println("Draw");
            return;
        }
        else if(s==2){
            print();
            System.out.println("X wins");
            return;
        }
        else if(s==3){
            print();
            System.out.println("O wins");
            return;
        }
        print();
        comp(0,level);
        s = help();
        if(s==0) func1(level);
        else if(s==1){
            print();
            System.out.println("Draw");
        }
        else if(s==2){
            print();
            System.out.println("X wins");
        }
        else if(s==3){
            print();
            System.out.println("O wins");
        }

    }
    public void func2(String level){
        print();
        comp(1,level);
        int s = help();
        if(s==1){
            print();
            System.out.println("Draw");
            return;
        }
        else if(s==2){
            print();
            System.out.println("X wins");
            return;
        }
        else if(s==3){
            print();
            System.out.println("O wins");
            return;
        }
        print();
        user();
        s = help();
        if(s==0) func2(level);
        else if(s==1){
            print();
            System.out.println("Draw");
        }
        else if(s==2){
            print();
            System.out.println("X wins");
        }
        else if(s==3){
            print();
            System.out.println("O wins");
        }

    }
    public void func3(){
        print();
        user();
        int s = help();
        if(s==1){
            print();
            System.out.println("Draw");
            return;
        }
        else if(s==2){
            print();
            System.out.println("X wins");
            return;
        }
        else if(s==3){
            print();
            System.out.println("O wins");
            return;
        }
        print();
        user();
        s = help();
        if(s==0) func3();
        else if(s==1){
            print();
            System.out.println("Draw");
        }
        else if(s==2){
            print();
            System.out.println("X wins");
        }
        else if(s==3){
            print();
            System.out.println("O wins");
        }

    }
    public void func4(String level1,String level2){
        print();
        comp(1,level1);
        int s = help();
        if(s==1){
            print();
            System.out.println("Draw");
            return;
        }
        else if(s==2){
            print();
            System.out.println("X wins");
            return;
        }
        else if(s==3){
            print();
            System.out.println("O wins");
            return;
        }
        print();
        comp(0,level2);
        s = help();
        if(s==0) func4(level1,level2);
        else if(s==1){
            print();
            System.out.println("Draw");
        }
        else if(s==2){
            print();
            System.out.println("X wins");
        }
        else if(s==3){
            print();
            System.out.println("O wins");
        }

    }
    public boolean bad_param(String[] input){
        if(input.length < 3){
            return false;
        }
        if(!input[0].equals("start")){
            return false;
        }
        if(!input[1].equals("user") && !input[1].equals("easy")&& !input[1].equals("medium")){
            return false;
        }
        return input[2].equals("user") || input[2].equals("easy") || input[2].equals("medium");
    }

}



public class Main {
    public static void main(String[] args) {
        // write your code here
        TicTacToe t = new TicTacToe();
        t.init();
        while(true){
            String[] input = t.sc.nextLine().split(" ");
            if(input[0].equals("exit")){
                break;
            }
            if(!t.bad_param(input)){
                System.out.println("Bad parameters!");
                continue;
            }
            if(input[1].equals("user") && input[2].equals("user")){
                t.func3();
            }
            else if(input[1].equals("user")){
                t.func1(input[2]);
            }
            else if(input[2].equals("user")){
                t.func2(input[1]);
            }
            else{
                t.func4(input[1],input[2]);
            }
        }
    }

}
