package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    public String IDPost;
    public String AuthorID;
    public String Content;
    public long TimeStamp;
    public ArrayList<Comments> Comments;
}
