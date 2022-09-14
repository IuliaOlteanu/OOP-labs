package Problema3;

import java.util.ArrayList;
import java.util.List;

public class Channel {
    List<User> channels = new ArrayList<>();
    String name;

    public Channel(String name) {
        this.name = name;
    }

    void subscribe(User user) {
        if(!channels.contains(user))
            channels.add(user);
    }

    void unsubscribe(User user) {
        if(channels.contains(user))
            channels.remove(user);
    }

    void notify(String notification) {
        for(User user : channels)
            System.out.println(notification + " for user " + user.name + " from " + user.country);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Channel{");
        sb.append("channels=").append(channels);
        sb.append(",name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

class TestObserver {
    public static void main(String args[]) {
        Channel channel = new Channel("Youtube");
        User user1 = new User("Mihai", "Romania");
        User user2 = new User("Laurel", "USA");
        User user3 = new User("Marie", "UK");

        channel.subscribe(user1);
        channel.subscribe(user2);
        channel.subscribe(user3);
        System.out.println(channel);

        channel.unsubscribe(user2);
        System.out.println(channel);

        channel.notify("New video on " + channel.name);
    }
}