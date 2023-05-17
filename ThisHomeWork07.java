public class ThisHomeWork07 {
	
	public static void main(String[] args) {
		Music music = new Music("少年歌行", 300);
	music.play();
	System.out.println(music.getInfo());
	
	}
}

class Music {  //公有类
	String name;
	int times;
	
	public Music(String name, int tims) {
		this.name = name;
		this.times = times;
	}
	//播放play功能
	public void play() {
		System.out.println("音乐" + name + "正在播放中...时长为" + times);
	
	}
	public String getInfo() {
		return "音乐" + name + "播放时间为" + times;
		
	}
}