#include<stdio.h>
#include<conio.h>
#include<graphics.h>
#include<math.h>
void main(){
	int gd = DETECT, gm, i=0;
	float x0,y0,x1,y1,dx,dy,xinc,yinc,x,y,l;

	clrscr();

	initgraph(&gd, &gm, "C:\\TURBOC3\\BGI");

	printf("Enter coordinates of starting point: \n");
	scanf("%f %f",&x0,&y0); 
	printf("Enter coordinates of ending point: \n");
	scanf("%f %f",&x1,&y1);
	
	if(abs(x0) == abs(x1) && abs(y0) == abs(y1)){
		putpixel((int)x1,(int)y1,15);
	}else{

		dx = x1 - x0;
		dy = y1 - y0;
		
		if(abs(dx) > abs(dy)){
			l = abs(dx);
		}else{
			l = abs(dy);
		}
		
		xinc = dx/l;
		yinc = dy/l;
		
		x = x0;
		y = y0;
		while(i<l){
			putpixel((int)x,(int)y,15);
			x = x + xinc;
			y = y + yinc;
			i++;
		}
	}
	// getch();
	closegraph();
}
