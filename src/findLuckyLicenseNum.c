/*
 *输入有缘车牌的源车牌(5位，浙A省略)，输出有缘车牌
 *种子车牌自定义（给定N个车牌号）
 *要求有缘车牌的组成与源车牌数字或字母相同
 */
char* findLuckyLicenseNum(const char* sourceNum, char* luckyNum)
{
    int i, flag;
    int len =6;
    char seedsNum[] ={"xxxxx","xxxxx","xxxxx"...}；//种子车牌N个

    if (NULL == sourceNum)
    {
        return NULL;
    }

    for (i=0; i < N; i++)
    {
        int len = 0;
        flag = 0;
        char *p = seedsNum[i];
    	while(len<5)
    	{
        	if(NULL == strstr(sourceNum, *p))
        	{
            	break;
            	flag = 1;  //flag为1表明改字符串不符合
        	}
        	++p;
                ++len;
    	}
        if (0 == flag)
        {
    		strncpy(luckyNum, seedNum[i], len); 
    		return luckyNum;        
        }   
	   
    }
}
