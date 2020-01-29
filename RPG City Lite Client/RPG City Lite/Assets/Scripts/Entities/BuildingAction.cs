
public class BuildingAction 
{
    long actionsId;
    string category;
    int level;
    string type;
    int value;

    public long ActionsId { get => actionsId; set => actionsId = value; }
    public string Category { get => category; set => category = value; }
    public int Level { get => level; set => level = value; }
    public string Type { get => type; set => type = value; }
    public int Value { get => value; set => this.value = value; }
}
