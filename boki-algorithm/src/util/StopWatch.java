package util;

/**
*   public static void main(String[] args)
 *   {
 *     Stopwatch s = new Stopwatch();
 *     s.start();
 *     // your code runs here
 *     s.stop();
 *     System.err.println("elapsed time: " + s.getElapsedTime());
 *   }
*/
public class StopWatch {

//    private long startTime = -1;
//    private float startTime = -1;
    private double startTime = -1;
//    private long stopTime = -1;
//    private float stopTime = -1;
    private double stopTime = -1;
    private boolean running = false;

    public StopWatch start() {
        startTime = (double) System.currentTimeMillis();
//        float v = System.currentTimeMillis();
        running = true;
        return this;
    }

    public StopWatch stop() {
        stopTime = (double) System.currentTimeMillis();
        running = false;
//        System.out.println("\n"+ColorInfo.ANSI_RED+"소요시간 " + Math.round((stopTime - startTime)*1000)/1000.0+ColorInfo.ANSI_RESET+"\n");
//        System.out.printf("\n"+ColorInfo.ANSI_RED+"소요시간 %.10f"+ColorInfo.ANSI_RESET+"\n", stopTime - startTime);
        System.out.printf(ColorInfo.ANSI_RED+"소요시간 %.10f"+ColorInfo.ANSI_RESET+"\n", stopTime - startTime);
        this.reset();
        return this;
    }

//    public long getElapsedTime() {
//    public float getElapsedTime() {
    public double getElapsedTime() {
        if (startTime == -1) {
            return 0;
        }
        if (running) {
//            return (float)System.currentTimeMillis() - startTime;
            return (double) System.currentTimeMillis() - startTime;
        } else {
            return stopTime - startTime;
        }
    }

    public StopWatch reset() {
        startTime = -1;
        stopTime = -1;
        running = false;
        return this;
    }

    @Override
    public String toString() {
        return "StopWatch{" +
            "startTime=" + startTime +
            ", stopTime=" + stopTime +
            ", running=" + running +
            '}';
    }
}