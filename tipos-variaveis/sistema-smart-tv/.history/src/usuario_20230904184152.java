public class usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();


        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume Atual: " + smartTv.volume);

        System.out.println("TV ligada: " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        

        smartTv.ligar();
        System.out.println("Novo Status - TV Ligada" + smartTv.ligada);

        smartTv.deligar();
        System.out.println("Novo Status - Tv Ligada: "+ smartTv.ligada);
}

}
