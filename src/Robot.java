public class Robot {
    int x;
    int y;
    String direcion;

    Robot(){
        this.x=0;
        this.y=0;
        this.direcion="NORD";
    }
    public Robot(int x, int y, String direcion) {
        this.x = x;
        this.y = y;
        this.direcion = direcion;
    }

    void avancer(){
        if (this.direcion=="NORD"){
            this.y++;
        } else if (this.direcion=="SUD") {
            this.y--;
        } else if (this.direcion=="EST") {
            this.x++;
        } else if (this.direcion=="OUEST") {
            this.x--;
        }
    }

    void tourner(){
        if (this.direcion=="NORD"){
            this.direcion="EST";
        } else if (this.direcion=="EST") {
            this.direcion="SUD";
        } else if (this.direcion=="SUD") {
            this.direcion="OUEST";
        } else if (this.direcion=="OUEST") {
            this.direcion="NORD";
        }
    }

    public static void main(String[] args) {
        Robot terminator= new Robot(1,1,"SUD");

        terminator.tourner();
        terminator.avancer();
        terminator.tourner();
        terminator.avancer();

        System.out.println(terminator.x);
        System.out.println(terminator.y);
        System.out.println(terminator.direcion);
    }
}
