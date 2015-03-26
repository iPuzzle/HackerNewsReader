package com.hitherejoe.hackernews.util;

import com.hitherejoe.hackernews.data.model.Post;
import com.hitherejoe.hackernews.data.model.User;

import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

public class MockModelsUtil {

    public static Long generateRandomLong() {
        return new Random().nextLong();
    }
    public static String generateRandomString() {
        return UUID.randomUUID().toString();
    }

    public static Post createMockStory() {
        Post story = new Post();
        story.id = generateRandomLong();
        story.postType = Post.PostType.LINK;
        story.url = "www.hitherejoe.com";
        story.title = "Title";
        story.score = 1000L;
        story.by = "JoeBirch";
        story.type = "story";
        return story;
    }

    public static Post createMockStoryWithId(Long id) {
        Post story = new Post();
        story.id = id;
        story.postType = Post.PostType.LINK;
        story.url = "www.hitherejoe.com";
        story.title = "Title";
        story.score = 1000L;
        story.by = "JoeBirch";
        story.type = "story";
        return story;
    }

    public static User createMockUser() {
        User user = new User();
        user.id = generateRandomString();
        user.about = "about";
        user.karma = 100;
        user.submitted = new ArrayList<>();
        user.submitted.add(102234L);
        user.submitted.add(123454L);
        user.submitted.add(773454L);
        user.submitted.add(666454L);
        return user;
    }

}