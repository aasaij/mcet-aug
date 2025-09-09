public class SmartPhone implements Phone, Camera, MusicPlayer{
    @Override
   public void makeCall(String phoneNumber){
    System.out.println("Making call to " + phoneNumber);
   }
   @Override
   public void takePicture(){
    System.out.println("Taking picture...");
   }
    @Override
   public void playMusic(String musicName){
    System.out.println("Playing " + musicName);
   }
    @Override
    public void takeVideo() {
        // TODO Auto-generated method stub
        System.out.println("Taking video...");
    }    
}
