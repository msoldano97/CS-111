public void scale(int scale)
{
    int minuteValue = 0, hourValue = 0;
    minuteValue = minutes + (hours)*60;
    minuteValue *= scale;
    if (minuteValue >= 60)
    {
        while (minuteValue > 59)
        {
            hourValue++;
                minuteValue -= 60;
            
        }
    }
    
    
    hours = hourValue;
    minutes = minuteValue;
    }
