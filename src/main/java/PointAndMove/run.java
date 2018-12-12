package PointAndMove;

public class run {
    public static void main(String[] args) {
        MovablePoint mov  = new MovablePoint(1,2,3,4);
        System.out.println(mov);
        mov.move();
        System.out.println(mov);
        mov.move();mov.move();mov.move();mov.move();
        System.out.println(mov);
    }
}
