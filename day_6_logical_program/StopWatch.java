package day_6_logical_program;

public class StopWatch {
	public long startTime = 0;
	public long endTime = 0;
	public long elapsed;

	public void starTime() {
		startTime = System.currentTimeMillis();
		System.out.println("Start Time is: " + startTime);
	}

	public void endTime() {
		endTime = System.currentTimeMillis();
		System.out.println("End Time is: " + startTime);
	}

	public long getElapsedTime() {
		elapsed = endTime - startTime;
		return elapsed;
	}

	public static void main(String[] args) throws Exception {
		StopWatch sw = new StopWatch();
		sw.starTime();

		System.out.println();
		sw.endTime();

		long l = sw.getElapsedTime();
		System.out.println();
		System.out.println("Total Time Elapsed(in millisec) is:" + l);
		System.out.println();
		System.out.println("Converting millisec to seconds: " + (l / 1000) + " sec");
	}
}
