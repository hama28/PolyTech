public abstract class TimeCount {

    public abstract void time();

    public void timecount() {
        // 処理前の時刻を取得
        long startTime = System.nanoTime();

        // 時間計測をしたい処理
        time();

        // 処理後の時刻を取得
        long endTime = System.nanoTime();

        System.out.println("開始時刻：" + startTime + " ナノ秒");
        System.out.println("終了時刻：" + endTime + " ナノ秒");
        System.out.println("処理時間：" + ((endTime - startTime) / 1000) + " マイクロ秒");
    }
}