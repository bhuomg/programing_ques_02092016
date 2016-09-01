//IMPLEMENTATION OF AN QUEUE USING LINKED LIST 
// OPERATION -- enqueue() for insert an element and dequeue() for remove an element
/*INPUT FORMAT:
  4
  1 3 5 4
  1
  6
  OUTPUT:
  1 3 5 4 6
*/


#include<iostream>
#include<stdio.h>
#include<conio.h>
using namespace std;

struct node
{
    int data;
    node *next;
}*HEAD = NULL,*TAIL = NULL,*ptr = NULL,*np = NULL;

void enqueue(int new_data) // for enqueue an element at TAIL(end)
{
    np = new node;
    np->data = new_data;
    np->next = NULL;
    if(HEAD == NULL)
    {
        HEAD = HEAD = np;
        TAIL->next = NULL;
    }
    else
    {
        TAIL->next = np;
        TAIL = np;
        TAIL->next = NULL;
    }
}
int dequeue()  		// for dequeue an element from HEAD(front)
{
    int temp;
    if(HEAD == NULL)
    {
        cout<<"empty queue\n";
    }
    else
    {
        ptr = HEAD;
        temp= ptr->data;
        HEAD = HEAD->next;
        delete(ptr);
        return(temp);
    }
}
int main()
{
    int size,count = 0,input;
    int flag;
    cin>>size;    //first line of input (initial size of queue)
    
    while (count < size)		// second line of input (enqueue operation)
    {
	    cin>>input;
        enqueue(input);
        count++;
    }
    
    cin>>flag;			// third line of input
    
	if(flag)			//if flag=1 then enqueue next input (fourth line of input)
     {
     	int next_ele;
     	cin>>next_ele;
     	enqueue(next_ele);
     	
	}
    else				// if flag=0 , dequeue an element from HEAD
	{
	    if (HEAD != NULL)
            dequeue();
     }
     
     while(HEAD != NULL)			// printing modified queue
     {
     	cout<<HEAD->data;
     	HEAD=HEAD->next;
     	
	 }
	 
    return 0;
}

