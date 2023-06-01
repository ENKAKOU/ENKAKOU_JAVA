package chapter19;

import chapter19.Reader_;

public class BufferedReader_ extends Reader_ {

    private Reader_ reader_;
    public BufferedReader_(Reader_ reader_) {
        this.reader_ = reader_;
    }

    public void readFile() {
        reader_.readFile();
    }

    public void readFiles(int num) {
        for(int i = 0; i < num; i++) {
            reader_.readFile();
        }
    }

    public void readStrings(int num) {
        for(int i = 0; i <num; i++) {
            reader_.readString();
        }
    }

}
