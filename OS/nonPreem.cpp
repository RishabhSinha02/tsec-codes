// #include<bits/stdc++.h>
#include "./stdc++.h"
using namespace std;
int n;

struct process
{
    int id, a, b, priority, c;
} p[100];
bool visit[100] = {false};
void sort()
{
    for (int i = 0; i < n; i++)
    {
        for (int j = i + 1; j < n; j++)
        {
            if (p[i].a > p[j].a)
            {
                swap(p[i], p[j]);
            }
        }
    }
}
int min_priority(int time)
{
    int min = 10000, index = -1;
    for (int i = 0; i < n; i++)
    {
        if (p[i].a <= time and !visit[i] and min > p[i].priority)
        {
            min = p[i].priority;
            index = i;
        }
    }
    return index;
}
void priorityalgo()
{
    sort();
    int time = 0;

    for (int i = 0; i < n; i++)
    {
        int idx = min_priority(time);
        if (idx != -1)
        {
            visit[idx] = true;
            p[idx].c = p[idx].b + time;
            time = p[idx].c;
        }
        else
        {
            time++;
            i--;
        }
    }
    float turn = 0, wait = 0;
    cout << "\nProcess\tArrival\tBurst\tPrior\tComp\tTurn\tWait\n";
    for (int i = 0; i < n; i++)
    {
        cout << p[i].id + 1 << "\t" << p[i].a << "\t" << p[i].b << "\t" << p[i].priority << "\t" << p[i].c << "\t" << p[i].c - p[i].a << "\t" << p[i].c - p[i].a - p[i].b << "\n";
        turn += p[i].c - p[i].a;
        wait += p[i].c - p[i].a - p[i].b;
    }
    cout << "\n"
         << "Avg Trunaround time:" << turn / n << "\n"
         << "Avg Waiting time:" << wait / n;
}
int main()
{
    cout << "Enter the number of process:";
    cin >> n;
    cout << "Enter the arrival time of all process:";
    for (int i = 0; i < n; i++)
    {
        cin >> p[i].a;
        p[i].id = i;
    }
    cout << "Enter the burst time of all process:";

    for (int i = 0; i < n; i++)
    {
        cin >> p[i].b;
    }
    cout << "Enter the priority of all process:";
    for (int i = 0; i < n; i++)
    {
        cin >> p[i].priority;
    }
    priorityalgo();
}

/*
Enter the number of process:7
Enter the arrival time of all process:0 2 1 4 6 5 7
Enter the burst time of all process:3 5 4 2 9 4 10
Enter the priority of all process:2 6 3 5 7 4 10
Process Arrival Burst Prior Comp Turn Wait 1032330 3143762
2 2 5 6 18 16 11
4 4 2 5 13 9 7
6 5 4 4 11 6 2
5 6 9 7 27 21 12 7 7 10 10 37 30 20
Avg Trunaround time:13 Avg Waiting time:7.71429
*/