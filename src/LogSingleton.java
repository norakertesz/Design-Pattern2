public class LogSingleton {

    private static LogSingleton instance = null;
    private LogSingleton() {

    }

    public static LogSingleton getInstance(){
        if(instance==null) {
            System.out.println("LogSingleton: erstelle mich neu. Es ist nämlich mein erster Aufruf");
            instance = new LogSingleton();
        }else{
            System.out.println("LogSingleton: Das ist nicht der erster Zugriff, gebe instanz zurück");

        }return instance;

    }
    public void log(String text){
        System.out.println("Logging: "+ text);
    }
}
