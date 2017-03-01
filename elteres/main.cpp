#include <iostream>
#include <queue>
#include <map>
#include <stdlib.h>

int main()
{

    int k;
    std::cin>>k;
    std::map<long,long> meres;
    long act;
    bool ok=false;

    int maxi;
    int maxe=0;
    for(int i=0; i<k; ++i)
    {
        std::cin>>act;
        if(meres.find(act)==meres.end())
        {
            meres[act]=i;

        }
        else
        {
            ok=true;
            meres[act]=i-meres[act];
            if(meres[act]>maxe)
            {
                maxe=meres[act];
                maxi=act;
            }
        }
    }

    if(!ok)
    {
        std::cout<<0<<std::endl;
    }
    else
    {
        std::cout<<maxi<<std::endl;
    }

    return 0;
}
