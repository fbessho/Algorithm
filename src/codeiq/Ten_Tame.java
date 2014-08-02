package codeiq;

import java.util.concurrent.atomic.AtomicInteger;

// メインクラス
public class Ten_Tame {
    public static void main(String[] args) throws InterruptedException {
        OfficeLady yasuko = new OfficeLady();    // ヤスコ
        OfficeLady keiko  = new OfficeLady();    // ケイコ
        yasuko.start();
        keiko.start();
        yasuko.join();
        keiko.join();
        System.out.println("ヤスコ(数えた枚数):" + yasuko.myCounter);
        System.out.println("ケイコ(数えた枚数):" + keiko.myCounter);
        System.out.println("基幹システム(合計入金額):" + MainFrame.counter.intValue());
    }
}
// 銀行員クラス
class OfficeLady extends Thread {
    public int myCounter = 0;                    // 数えた1円玉の枚数
    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++) {
            myCounter++;                        // 枚数をカウントアップ
            MainFrame.nyuukin();                // 基幹システム入金操作(カウントアップ)
        }
    }
}
// 基幹システムクラス
class MainFrame {
    public static AtomicInteger counter = new AtomicInteger(0);            // 入金された1円玉の枚数
    // 1円玉入金処理
    public static void nyuukin() {
            counter.incrementAndGet();                // 枚数をカウントアップ
    }
}
