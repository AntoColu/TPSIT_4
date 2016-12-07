#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<sys/types.h>
main(){
       pid_t pid;
       int n;

       do{
          printf("Quanti processi vuoi creare? ");
          scanf("%d",&n);
       }while((n<0)||(n>3));

       printf("Sono il padre con PID %d\n",getpid());
       while(n>0){
          pid=fork();
          if(pid==0) {
             sleep(1);
             printf("Sono il processo con PID %d, mio padre ha PID %d\n",getpid(),getppid());
           }
           n--;
       }

       exit(0);
}
