public class usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv  = new SmartTv(); 
        System.out.println("Tv ligada" + smartTv.ligada);
        System.out.println("canal atual " + smartTv.canal);
        System.out.println("Volume " + smartTv.volume);

        smartTv.ligar ();
        System.out.println("A Tv ligada " + smartTv.ligada);
    }
}
