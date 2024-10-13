package threading;


public class Logger {

    private static Logger instance; // early initialized
    // private constructor, you will not able to make object from outside of this class
    private Logger(){

    }
    // static method
    // threads
    public static Logger getInstance(){
       // t1, t2 gets instance null
        if(instance == null) {
            //t2
            synchronized (Logger.class){
                if(instance == null){
                    instance = new Logger();
                }
            }

        }
        return instance;
    }

    public void printLog(String logg){
        System.out.println(logg);
    }

    public static void main(String[] args) {
        Logger logger = getInstance();
       logger.printLog("printing ...");
    }

}
// multiple threads running inside
// 2 threads creates 2 objects ?
// code which is written is not thread safe
// making this class thread safe is now your resp.