
public class BuildingRequirement 
{
    long reqsId;
    string category;
    string type;
    int value;
    int level;
    string image;

    public long ReqsId { get => reqsId; set => reqsId = value; }
    public string Category { get => category; set => category = value; }
    public string Type { get => type; set => type = value; }
    public int Value { get => value; set => this.value = value; }
    public int Level { get => level; set => level = value; }
    public string Image { get => image; set => image = value; }
}
