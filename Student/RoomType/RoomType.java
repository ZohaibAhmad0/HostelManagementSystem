enum  RoomType
{
    SingleSharing(20000), DoubleSharing(15000);
    private int rent;

    private RoomType(int rent)
    {
     this.rent = rent;
    }

    public int getRent()
    {
        return rent;
    }

    public void setRent(int rent)
    {
        this.rent = rent;
    }
}
