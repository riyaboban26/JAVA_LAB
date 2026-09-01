// Task 2 - Smart Device Control System
// Demonstration of Interfaces and Multiple Inheritance

// ================= INTERFACES =================

// Wi-Fi Interface
interface WiFiEnabled {
    void connectWiFi();
}

// Voice Control Interface
interface VoiceControlled {
    void voiceCommand();
}

// Music Player Interface
interface MusicPlayer {
    void playMusic();
}

// Video Streaming Interface
interface VideoStreaming {
    void streamVideo();
}

// Temperature Monitor Interface
interface TemperatureMonitor {
    void showTemperature();
}

// ================= DEVICE CLASSES =================

// Smart Speaker
class SmartSpeaker implements WiFiEnabled, VoiceControlled, MusicPlayer {

    public void connectWiFi() {
        System.out.println("Connected to Wi-Fi.");
    }

    public void voiceCommand() {
        System.out.println("Voice Assistant Activated.");
    }

    public void playMusic() {
        System.out.println("Playing Music.");
    }
}

// Smart TV
class SmartTV implements WiFiEnabled, MusicPlayer, VideoStreaming {

    public void connectWiFi() {
        System.out.println("Connected to Wi-Fi.");
    }

    public void playMusic() {
        System.out.println("Playing Music on TV.");
    }

    public void streamVideo() {
        System.out.println("Streaming Online Videos.");
    }
}

// Smart Air Conditioner
class SmartAC implements WiFiEnabled, VoiceControlled, TemperatureMonitor {

    public void connectWiFi() {
        System.out.println("Connected to Wi-Fi.");
    }

    public void voiceCommand() {
        System.out.println("Voice Command Accepted.");
    }

    public void showTemperature() {
        System.out.println("Current Temperature : 24°C");
    }
}

// Smart Watch
class SmartWatch implements WiFiEnabled, TemperatureMonitor {

    public void connectWiFi() {
        System.out.println("Connected to Wi-Fi.");
    }

    public void showTemperature() {
        System.out.println("Body Temperature : 36.8°C");
    }
}

// Smart Car (New Device)
// No interface modification required
class SmartCar implements WiFiEnabled, VoiceControlled, MusicPlayer, VideoStreaming {

    public void connectWiFi() {
        System.out.println("Car Connected to Wi-Fi.");
    }

    public void voiceCommand() {
        System.out.println("Voice Navigation Started.");
    }

    public void playMusic() {
        System.out.println("Playing Car Music.");
    }

    public void streamVideo() {
        System.out.println("Streaming Entertainment Videos.");
    }
}

// ================= MAIN CLASS =================

public class Main1 {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" SMART DEVICE CONTROL SYSTEM");
        System.out.println("========================================");

        // Smart Speaker
        System.out.println("\n----- Smart Speaker -----");
        SmartSpeaker speaker = new SmartSpeaker();
        speaker.connectWiFi();
        speaker.voiceCommand();
        speaker.playMusic();

        // Smart TV
        System.out.println("\n----- Smart TV -----");
        SmartTV tv = new SmartTV();
        tv.connectWiFi();
        tv.playMusic();
        tv.streamVideo();

        // Smart AC
        System.out.println("\n----- Smart AC -----");
        SmartAC ac = new SmartAC();
        ac.connectWiFi();
        ac.voiceCommand();
        ac.showTemperature();

        // Smart Watch
        System.out.println("\n----- Smart Watch -----");
        SmartWatch watch = new SmartWatch();
        watch.connectWiFi();
        watch.showTemperature();

        // Smart Car
        System.out.println("\n----- Smart Car -----");
        SmartCar car = new SmartCar();
        car.connectWiFi();
        car.voiceCommand();
        car.playMusic();
        car.streamVideo();

        // Interface References
        System.out.println("\n========================================");
        System.out.println("INTERFACE REFERENCE DEMONSTRATION");
        System.out.println("========================================");

        WiFiEnabled wifi = new SmartCar();
        wifi.connectWiFi();

        VoiceControlled voice = new SmartSpeaker();
        voice.voiceCommand();

        MusicPlayer music = new SmartTV();
        music.playMusic();

        VideoStreaming video = new SmartCar();
        video.streamVideo();

        TemperatureMonitor temp = new SmartAC();
        temp.showTemperature();

        System.out.println("\nAll Smart Devices Demonstrated Successfully.");
    }
}