package uiGame;


import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class AI {

	
	public static void think(JFrame frame) {
		/*frame.setVisible(true);
		int win =iswin();
		if(win==3)return;
		int[][]point=aisalf1();
		point=aidanger1(point);
		upup(point,frame);
		win =iswin();
		if(win==3)return;
		UI.systemtimes=0;
		UI.str.setText("轮到你下啦。");*/
		AII.think(frame);
	}
	
	/*private static int[][] aisalf1() {//alpha1
		
		UI.str.setText("轮到机器人下啦");
		int[][] point=new int[25][25];
		for(int p=5;p<20;p++) {
			for(int q=5;q<20;q++) {
				if(UI.systemnum[p][q]==0) {
					UI.systemnum[p][q]=7;//如果点击这里
					int ipoint=1;
					//计算机器人分数
					for(int x=4;x<19;x++) {
						for(int y=4;y<19;y++) {//遍历每个格子的信息
							
							if(UI.systemnum[x][y]==7) {//如果发现棋子
								//初始化各个方向的变量
								int up=1;
								int down=1;
								int left=1;
								int right=1;
								int upleft=1;
								int upright=1;
								int downleft=1;
								int downright=1;
								//从当前格子向各个方向蔓延，计算这个格子和附近格子产生的连珠情况
								for(int cd=0;cd<5;cd++) {	
									
									if(UI.systemnum[x-up][y]==7) up++;
									if(UI.systemnum[x+down][y]==7)down++;
									if(UI.systemnum[x][y-left]==7)left++;
									if(UI.systemnum[x][y+right]==7)right++;
									if(UI.systemnum[x-upleft][y-upleft]==7)upleft++;
									if(UI.systemnum[x+downright][y+downright]==7)downright++;
									if(UI.systemnum[x-upright][y+upright]==7)upright++;
									if(UI.systemnum[x+downleft][y-downleft]==7)downleft++;
								}
					
								//如果敌方五星连珠
								if(up+down>=6||left+right>=6||upleft+downright>=6||upright+downleft>=6) {
									ipoint+=65536;
								}
								//如果敌方四星连珠
								//看情况加分
								if(up+down==5) {
									if(UI.systemnum[x-up][y]==0&&x-up>=4&&UI.systemnum[x+down][y]==0&&x+down<=19) {
										ipoint+=1024;
									}
									else if(UI.systemnum[x+down][y]==3&&x+down<=19&&UI.systemnum[x-up][y]==0&&x-up>=4) {
										ipoint+=64;
									}
									else if(UI.systemnum[x+down][y]==0&&x+down<=19&&UI.systemnum[x-up][y]==3&&x-up>=4) {
										ipoint+=64;
									}
									else if(UI.systemnum[x+down][y]==0&&x+down<=19&&x-up<4) {
										ipoint+=64;
									}
									else if(x+down>19&&UI.systemnum[x-up][y]==0&&x-up>=4) {
										ipoint+=64;
									}
								}
								if(left+right==5) {
									if(UI.systemnum[x][y-left]==0&&y-left>=4&&UI.systemnum[x][y+right]==0&&y+right<=19) {
										ipoint+=1024;
									}
									else if(UI.systemnum[x][y-left]==3&&y-left>=4&&UI.systemnum[x][y+right]==0&&y+right<=19) {
										ipoint+=64;
									}
									else if(UI.systemnum[x][y-left]==0&&y-left>=4&&UI.systemnum[x][y+right]==3&&y+right<=19) {
										ipoint+=64;
									}
									else if(UI.systemnum[x][y-left]==0&&y-left>=4&&y+right>19) {
										ipoint+=64;
									}
									else if(y-left<4&&UI.systemnum[x][y+right]==0&&y+right<=19) {
										ipoint+=64;
									}
								}
								if(upleft+downright==5) {
									if(UI.systemnum[x-upleft][y-upleft]==0&&y-left>=4&&x-upleft>=4&&UI.systemnum[x+downright][y+downright]==0&&y+downright<=19&&x+downright<=19) {
										ipoint+=1024;
									}
									else if(UI.systemnum[x-upleft][y-upleft]==3&&y-left>=4&&x-upleft>=4&&UI.systemnum[x+downright][y+downright]==0&&y+downright<=19&&x+downright<=19) {
										ipoint+=64;
									}
									else if(UI.systemnum[x-upleft][y-upleft]==0&&y-left>=4&&x-upleft>=4&&UI.systemnum[x+downright][y+downright]==3&&y+downright<=19&&x+downright<=19) {
										ipoint+=64;
									}
									else if(y-left<4&&x-upleft<4&&UI.systemnum[x+downright][y+downright]==0&&y+downright<=19&&x+downright<=19) {
										ipoint+=64;
									}
									else if(UI.systemnum[x-upleft][y-upleft]==0&&y-left>=4&&x-upleft>=4&&y+downright>19&&x+downright>19) {
										ipoint+=64;
									}
								}
								if(downleft+upright==5) {
									if(UI.systemnum[x+downleft][y-downleft]==0&&y-downleft>=4&&x+downleft<=19&&UI.systemnum[x-upright][y+upright]==0&&y+upright<=19&&x-upright>=4) {
										ipoint+=1024;
									}
									else if(UI.systemnum[x+downleft][y-downleft]==0&&y-downleft>=4&&x+downleft<=19&&UI.systemnum[x-upright][y+upright]==3&&y+upright<=19&&x-upright>=4) {
										ipoint+=64;
									}
									else if(UI.systemnum[x+downleft][y-downleft]==3&&y-downleft>=4&&x+downleft<=19&&UI.systemnum[x-upright][y+upright]==0&&y+upright<=19&&x-upright>=4) {
										ipoint+=64;
									}
									else if(y-downleft<4&&x+downleft>19&&UI.systemnum[x-upright][y+upright]==0&&y+upright<=19&&x-upright>=4) {
										ipoint+=64;
									}
									else if(UI.systemnum[x+downleft][y-downleft]==0&&y-downleft>=4&&x+downleft<=19&&y+upright>19&&x-upright<4) {
										ipoint+=64;
									}

								}
								//如果敌方三星连珠
								if(up+down==4) {
									if(UI.systemnum[x-up][y]==0&&x-up>=4&&UI.systemnum[x+down][y]==0&&x+down<=19) {
										ipoint+=32;
									}
									else if(UI.systemnum[x-up][y]==3&&x-up>=4&&UI.systemnum[x+down][y]==0&&x+down<=19) {
										ipoint+=4;
									}
									else if(UI.systemnum[x-up][y]==0&&x-up>=4&&UI.systemnum[x+down][y]==3&&x+down<=19) {
										ipoint+=4;
									}
									else if(UI.systemnum[x-up][y]==0&&x-up>=4&&x+down>19) {
										ipoint+=4;
									}
									else if(x-up<4&&UI.systemnum[x+down][y]==0&&x+down<=19) {
										ipoint+=4;
									}
								}
								if(left+right==4) {
									if(UI.systemnum[x][y-left]==0&&y-left>=4&&UI.systemnum[x][y+right]==0&&y+right<=19) {
										ipoint+=32;
									}
									else if(UI.systemnum[x][y-left]==3&&y-left>=4&&UI.systemnum[x][y+right]==0&&y+right<=19) {
										ipoint+=4;
									}
									else if(UI.systemnum[x][y-left]==0&&y-left>=4&&UI.systemnum[x][y+right]==3&&y+right<=19) {
										ipoint+=4;
									}
									else if(y-left<4&&UI.systemnum[x][y+right]==0&&y+right<=19) {
										ipoint+=4;
									}
									else if(UI.systemnum[x][y-left]==0&&y-left>=4&&y+right>19) {
										ipoint+=4;
									}
								}
								if(upleft+downright==4) {
									if(UI.systemnum[x-upleft][y-upleft]==0&&y-left>=4&&x-upleft>=4&&UI.systemnum[x+downright][y+downright]==0&&y+downright<=19&&x+downright<=19) {
										ipoint+=32;
									}
									else if(UI.systemnum[x-upleft][y-upleft]==3&&y-left>=4&&x-upleft>=4&&UI.systemnum[x+downright][y+downright]==0&&y+downright<=19&&x+downright<=19) {
										ipoint+=4;
									}
									else if(UI.systemnum[x-upleft][y-upleft]==0&&y-left>=4&&x-upleft>=4&&UI.systemnum[x+downright][y+downright]==3&&y+downright<=19&&x+downright<=19) {
										ipoint+=4;
									}
									else if(y-left<4&&x-upleft<4&&UI.systemnum[x+downright][y+downright]==0&&y+downright<=19&&x+downright<=19) {
										ipoint+=4;
									}
									else if(UI.systemnum[x-upleft][y-upleft]==0&&y-left>=4&&x-upleft>=4&&UI.systemnum[x+downright][y+downright]==0&&y+downright>19&&x+downright>19) {
										ipoint+=4;
									}
								}
									
								if(downleft+upright==4) {
									if(UI.systemnum[x+downleft][y-downleft]==0&&y-downleft>=4&&x+downleft<=19&&UI.systemnum[x-upright][y+upright]==0&&y+upright<=19&&x-upright>=4) {
										ipoint+=32;
									}
									else if(UI.systemnum[x+downleft][y-downleft]==3&&y-downleft>=4&&x+downleft<=19&&UI.systemnum[x-upright][y+upright]==0&&y+upright<=19&&x-upright>=4) {
										ipoint+=4;
									}
									else if(UI.systemnum[x+downleft][y-downleft]==0&&y-downleft>=4&&x+downleft<=19&&UI.systemnum[x-upright][y+upright]==3&&y+upright<=19&&x-upright>=4) {
										ipoint+=4;
									}
									else if(y-downleft<4&&x+downleft>19&&UI.systemnum[x-upright][y+upright]==0&&y+upright<=19&&x-upright>=4) {
										ipoint+=4;
									}
									else if(UI.systemnum[x+downleft][y-downleft]==0&&y-downleft>=4&&x+downleft<=19&&y+upright>19&&x-upright<4) {
										ipoint+=4;
									}
								}
								
								//如果敌方二星连珠
								if(up+down==3) {
									if(UI.systemnum[x-up][y]==0&&x-up>=4&&UI.systemnum[x+down][y]==0&&x+down<=19) {
										ipoint+=4;
									}
									else if(UI.systemnum[x-up][y]==3&&x-up>=4&&UI.systemnum[x+down][y]==0&&x+down<=19) {
										ipoint+=2;
									}
									else if(UI.systemnum[x-up][y]==0&&x-up>=4&&UI.systemnum[x+down][y]==3&&x+down<=19) {
										ipoint+=2;
									}
									else if(UI.systemnum[x-up][y]==0&&x-up>=4&&x+down>19) {
										ipoint+=2;
									}
									else if(x-up<4&&UI.systemnum[x+down][y]==0&&x+down<=19) {
										ipoint+=2;
									}
								}
								if(left+right==3) {
									if(UI.systemnum[x][y-left]==0&&y-left>=4&&UI.systemnum[x][y+right]==0&&y+right<=19) {
										ipoint+=4;
									}
									else if(UI.systemnum[x][y-left]==3&&y-left>=4&&UI.systemnum[x][y+right]==0&&y+right<=19) {
										ipoint+=2;
									}
									else if(UI.systemnum[x][y-left]==0&&y-left>=4&&UI.systemnum[x][y+right]==3&&y+right<=19) {
										ipoint+=2;
									}
									else if(y-left<4&&UI.systemnum[x][y+right]==0&&y+right<=19) {
										ipoint+=2;
									}
									else if(UI.systemnum[x][y-left]==0&&y-left>=4&&y+right>19) {
										ipoint+=2;
									}
								}
								if(upleft+downright==3) {
									if(UI.systemnum[x-upleft][y-upleft]==0&&y-left>=4&&x-upleft>=4&&UI.systemnum[x+downright][y+downright]==0&&y+downright<=19&&x+downright<=19) {
										ipoint+=4;
									}
									else if(UI.systemnum[x-upleft][y-upleft]==3&&y-left>=4&&x-upleft>=4&&UI.systemnum[x+downright][y+downright]==0&&y+downright<=19&&x+downright<=19) {
										ipoint+=2;
									}
									else if(UI.systemnum[x-upleft][y-upleft]==0&&y-left>=4&&x-upleft>=4&&UI.systemnum[x+downright][y+downright]==3&&y+downright<=19&&x+downright<=19) {
										ipoint+=2;
									}
									else if(y-left<4&&x-upleft<4&&UI.systemnum[x+downright][y+downright]==0&&y+downright<=19&&x+downright<=19) {
										ipoint+=2;
									}
									else if(UI.systemnum[x-upleft][y-upleft]==0&&y-left>=4&&x-upleft>=4&&UI.systemnum[x+downright][y+downright]==0&&y+downright>19&&x+downright>19) {
										ipoint+=2;
									}
								}
									
								if(downleft+upright==3) {
									if(UI.systemnum[x+downleft][y-downleft]==0&&y-downleft>=4&&x+downleft<=19&&UI.systemnum[x-upright][y+upright]==0&&y+upright<=19&&x-upright>=4) {
										ipoint+=4;
									}
									else if(UI.systemnum[x+downleft][y-downleft]==3&&y-downleft>=4&&x+downleft<=19&&UI.systemnum[x-upright][y+upright]==0&&y+upright<=19&&x-upright>=4) {
										ipoint+=2;
									}
									else if(UI.systemnum[x+downleft][y-downleft]==0&&y-downleft>=4&&x+downleft<=19&&UI.systemnum[x-upright][y+upright]==3&&y+upright<=19&&x-upright>=4) {
										ipoint+=2;
									}
									else if(y-downleft<4&&x+downleft>19&&UI.systemnum[x-upright][y+upright]==0&&y+upright<=19&&x-upright>=4) {
										ipoint+=2;
									}
									else if(UI.systemnum[x+downleft][y-downleft]==0&&y-downleft>=4&&x+downleft<=19&&y+upright>19&&x-upright<4) {
										ipoint+=2;
									}
								}
			}
		}
		}
				point[p][q]=ipoint;
				UI.systemnum[p][q]=0;}
				else point[p][q]=-99999;
			}
		}
		return point;
		
	}
	public static void alpha(int[][]point,JFrame frame){
		int max=0;
		for(int a=5;a<20;a++) {
			for(int b=0;b<20;b++) {
				if(point[a][b]>=max)max=point[a][b];
			}
		}//求最大值
		if(max>20000||max<10) {
			//如果很大或者很小，不继续计算
			for(int aa=5;aa<20;aa++) {
				for(int bb=5;bb<20;bb++) {
					if(point[aa][bb]==max) {
						downimg(aa,bb,frame);
						return ;
					}
				}
			}
		}
		//不然就开始预判，加分
		
		return ;
		
	}
	private static int[][]  aidanger1(int[][]point) {
		for(int p=5;p<20;p++) {
			for(int q=5;q<20;q++) {
				
				if(UI.systemnum[p][q]==0) {
					UI.systemnum[p][q]=3;//如果点击这里
					int ipoint=1;
					//测试是否对敌不利
					for(int x=5;x<20;x++) {
						for(int y=5;y<20;y++) {
							if(UI.systemnum[x][y]==3) {
								int up=1;
								int down=1;
								int left=1;
								int right=1;
								int upleft=1;
								int upright=1;
								int downleft=1;
								int downright=1;
								
								//从当前格子向各个方向蔓延，计算这个格子和附近格子产生的连珠情况
								for(int cd=0;cd<5;cd++) {	
									
									if(UI.systemnum[x-up][y]==3) up++;
									
									if(UI.systemnum[x+down][y]==3)down++;	
									
									if(UI.systemnum[x][y-left]==3)left++;
									
									if(UI.systemnum[x][y+right]==3)right++;
									
									if(UI.systemnum[x-upleft][y-upleft]==3)upleft++;
									
									if(UI.systemnum[x+downright][y+downright]==3)downright++;
									
									if(UI.systemnum[x-upright][y+upright]==3)upright++;
									
									if(UI.systemnum[x+downleft][y-downleft]==3)downleft++;
								}
								//如果五星连珠
								if(up+down>=6||left+right>=6||upleft+downright>=6||upright+downleft>=6) {
									ipoint+=65536;
								}
								//如果敌方四星连珠
								//看情况加分
								if(up+down==5) {
									if(UI.systemnum[x-up][y]==0&&x-up>=5&&UI.systemnum[x+down][y]==0&&x+down<=20) {
										 
										ipoint+=1024;
									}
									else if(UI.systemnum[x+down][y]==3&&x+down<=20&&UI.systemnum[x-up][y]==0&&x-up>=5) {
										 
										ipoint+=64;
									}
									else if(UI.systemnum[x+down][y]==0&&x+down<=20&&UI.systemnum[x-up][y]==3&&x-up>=5) {
										 
										ipoint+=64;
									}
									else if(UI.systemnum[x+down][y]==0&&x+down<=20&&x-up<5) {
										 
										ipoint+=64;
									}
									else if(x+down>20&&UI.systemnum[x-up][y]==0&&x-up>=5) {
										 
										ipoint+=64;
									}
								}
								if(left+right==5) {
									if(UI.systemnum[x][y-left]==0&&y-left>=5&&UI.systemnum[x][y+right]==0&&y+right<=20) {
										 
										ipoint+=1024;
									}
									else if(UI.systemnum[x][y-left]==3&&y-left>=5&&UI.systemnum[x][y+right]==0&&y+right<=20) {
										 
										ipoint+=64;
									}
									else if(UI.systemnum[x][y-left]==0&&y-left>=5&&UI.systemnum[x][y+right]==3&&y+right<=20) {
									
										ipoint+=64;
									}
									else if(UI.systemnum[x][y-left]==0&&y-left>=5&&y+right>20) {
									
										ipoint+=64;
									}
									else if(y-left<5&&UI.systemnum[x][y+right]==0&&y+right<=20) {
									
										ipoint+=64;
									}
								}
								if(upleft+downright==5) {
									if(UI.systemnum[x-upleft][y-upleft]==0&&y-left>=5&&x-upleft>=5&&UI.systemnum[x+downright][y+downright]==0&&y+downright<=20&&x+downright<=20) {
									
										ipoint+=1024;
									}
									else if(UI.systemnum[x-upleft][y-upleft]==3&&y-left>=5&&x-upleft>=5&&UI.systemnum[x+downright][y+downright]==0&&y+downright<=20&&x+downright<=20) {
									
										ipoint+=64;
									}
									else if(UI.systemnum[x-upleft][y-upleft]==0&&y-left>=5&&x-upleft>=5&&UI.systemnum[x+downright][y+downright]==3&&y+downright<=20&&x+downright<=20) {
									
										ipoint+=64;
									}
									else if(y-left<5&&x-upleft<5&&UI.systemnum[x+downright][y+downright]==0&&y+downright<=20&&x+downright<=20) {
										
										ipoint+=64;
									}
									else if(UI.systemnum[x-upleft][y-upleft]==0&&y-left>=5&&x-upleft>=5&&y+downright>20&&x+downright>20) {
										 
										ipoint+=64;
									}
								}
								if(downleft+upright==5) {
									if(UI.systemnum[x+downleft][y-downleft]==0&&y-downleft>=5&&x+downleft<=20&&UI.systemnum[x-upright][y+upright]==0&&y+upright<=20&&x-upright>=5) {
										
										ipoint+=1024;
									}
									else if(UI.systemnum[x+downleft][y-downleft]==0&&y-downleft>=5&&x+downleft<=20&&UI.systemnum[x-upright][y+upright]==3&&y+upright<=20&&x-upright>=5) {
										 
										ipoint+=64;
									}
									else if(UI.systemnum[x+downleft][y-downleft]==3&&y-downleft>=5&&x+downleft<=20&&UI.systemnum[x-upright][y+upright]==0&&y+upright<=20&&x-upright>=5) {
										 
										ipoint+=64;
									}
									else if(y-downleft<5&&x+downleft>20&&UI.systemnum[x-upright][y+upright]==0&&y+upright<=20&&x-upright>=5) {
										 
										ipoint+=64;
									}
									else if(UI.systemnum[x+downleft][y-downleft]==0&&y-downleft>=5&&x+downleft<=20&&y+upright>20&&x-upright<5) {
										 
										ipoint+=64;
									}

								}
								//如果敌方三星连珠
								if(up+down==4) {
									if(UI.systemnum[x-up][y]==0&&x-up>=5&&UI.systemnum[x+down][y]==0&&x+down<=20) {
										ipoint+=32;
									}
									else if(UI.systemnum[x-up][y]==3&&x-up>=5&&UI.systemnum[x+down][y]==0&&x+down<=20) {
										ipoint+=4;
									}
									else if(UI.systemnum[x-up][y]==0&&x-up>=5&&UI.systemnum[x+down][y]==3&&x+down<=20) {
										ipoint+=4;
									}
									else if(UI.systemnum[x-up][y]==0&&x-up>=5&&x+down>20) {
										ipoint+=4;
									}
									else if(x-up<5&&UI.systemnum[x+down][y]==0&&x+down<=20) {
										ipoint+=4;
									}
								}
								if(left+right==4) {
									if(UI.systemnum[x][y-left]==0&&y-left>=5&&UI.systemnum[x][y+right]==0&&y+right<=20) {
										ipoint+=32;
									}
									else if(UI.systemnum[x][y-left]==3&&y-left>=5&&UI.systemnum[x][y+right]==0&&y+right<=20) {
										ipoint+=4;
									}
									else if(UI.systemnum[x][y-left]==0&&y-left>=5&&UI.systemnum[x][y+right]==3&&y+right<=20) {
										ipoint+=4;
									}
									else if(y-left<5&&UI.systemnum[x][y+right]==0&&y+right<=20) {
										ipoint+=4;
									}
									else if(UI.systemnum[x][y-left]==0&&y-left>=5&&y+right>20) {
										ipoint+=4;
									}
								}
								if(upleft+downright==4) {
									if(UI.systemnum[x-upleft][y-upleft]==0&&y-left>=5&&x-upleft>=5&&UI.systemnum[x+downright][y+downright]==0&&y+downright<=20&&x+downright<=20) {
										 
										ipoint+=32;
									}
									else if(UI.systemnum[x-upleft][y-upleft]==3&&y-left>=5&&x-upleft>=5&&UI.systemnum[x+downright][y+downright]==0&&y+downright<=20&&x+downright<=20) {
										ipoint+=4;
									}
									else if(UI.systemnum[x-upleft][y-upleft]==0&&y-left>=5&&x-upleft>=5&&UI.systemnum[x+downright][y+downright]==3&&y+downright<=20&&x+downright<=20) {
										ipoint+=4;
									}
									else if(y-left<5&&x-upleft<5&&UI.systemnum[x+downright][y+downright]==0&&y+downright<=20&&x+downright<=20) {
										ipoint+=4;
									}
									else if(UI.systemnum[x-upleft][y-upleft]==0&&y-left>=5&&x-upleft>=5&&UI.systemnum[x+downright][y+downright]==0&&y+downright>20&&x+downright>20) {
										ipoint+=4;
									}
								}
									
								if(downleft+upright==4) {
									if(UI.systemnum[x+downleft][y-downleft]==0&&y-downleft>=5&&x+downleft<=20&&UI.systemnum[x-upright][y+upright]==0&&y+upright<=20&&x-upright>=5) {
										 
										ipoint+=32;
									}
									else if(UI.systemnum[x+downleft][y-downleft]==3&&y-downleft>=5&&x+downleft<=20&&UI.systemnum[x-upright][y+upright]==0&&y+upright<=20&&x-upright>=5) {
										ipoint+=4;
									}
									else if(UI.systemnum[x+downleft][y-downleft]==0&&y-downleft>=5&&x+downleft<=20&&UI.systemnum[x-upright][y+upright]==3&&y+upright<=20&&x-upright>=5) {
										ipoint+=4;
									}
									else if(y-downleft<5&&x+downleft>20&&UI.systemnum[x-upright][y+upright]==0&&y+upright<=20&&x-upright>=5) {
										ipoint+=4;
									}
									else if(UI.systemnum[x+downleft][y-downleft]==0&&y-downleft>=5&&x+downleft<=20&&y+upright>20&&x-upright<5) {
										ipoint+=4;
									}
								}
								
								//如果敌方二星连珠
								if(up+down==3) {
									if(UI.systemnum[x-up][y]==0&&x-up>=5&&UI.systemnum[x+down][y]==0&&x+down<=20) {
										ipoint+=4;
									}
									else if(UI.systemnum[x-up][y]==3&&x-up>=5&&UI.systemnum[x+down][y]==0&&x+down<=20) {
										ipoint+=2;
									}
									else if(UI.systemnum[x-up][y]==0&&x-up>=5&&UI.systemnum[x+down][y]==3&&x+down<=20) {
										ipoint+=2;
									}
									else if(UI.systemnum[x-up][y]==0&&x-up>=5&&x+down>20) {
										ipoint+=2;
									}
									else if(x-up<5&&UI.systemnum[x+down][y]==0&&x+down<=20) {
										ipoint+=2;
									}
								}
								if(left+right==3) {
									if(UI.systemnum[x][y-left]==0&&y-left>=5&&UI.systemnum[x][y+right]==0&&y+right<=20) {
										ipoint+=4;
									}
									else if(UI.systemnum[x][y-left]==3&&y-left>=5&&UI.systemnum[x][y+right]==0&&y+right<=20) {
										ipoint+=2;
									}
									else if(UI.systemnum[x][y-left]==0&&y-left>=5&&UI.systemnum[x][y+right]==3&&y+right<=20) {
										ipoint+=2;
									}
									else if(y-left<5&&UI.systemnum[x][y+right]==0&&y+right<=20) {
										ipoint+=2;
									}
									else if(UI.systemnum[x][y-left]==0&&y-left>=5&&y+right>20) {
										ipoint+=2;
									}
								}
								if(upleft+downright==3) {
									if(UI.systemnum[x-upleft][y-upleft]==0&&y-left>=5&&x-upleft>=5&&UI.systemnum[x+downright][y+downright]==0&&y+downright<=20&&x+downright<=20) {
										ipoint+=4;
									}
									else if(UI.systemnum[x-upleft][y-upleft]==3&&y-left>=5&&x-upleft>=5&&UI.systemnum[x+downright][y+downright]==0&&y+downright<=20&&x+downright<=20) {
										ipoint+=2;
									}
									else if(UI.systemnum[x-upleft][y-upleft]==0&&y-left>=5&&x-upleft>=5&&UI.systemnum[x+downright][y+downright]==3&&y+downright<=20&&x+downright<=20) {
										ipoint+=2;
									}
									else if(y-left<5&&x-upleft<5&&UI.systemnum[x+downright][y+downright]==0&&y+downright<=20&&x+downright<=20) {
										ipoint+=2;
									}
									else if(UI.systemnum[x-upleft][y-upleft]==0&&y-left>=5&&x-upleft>=5&&UI.systemnum[x+downright][y+downright]==0&&y+downright>20&&x+downright>20) {
										ipoint+=2;
									}
								}
									
								if(downleft+upright==3) {
									if(UI.systemnum[x+downleft][y-downleft]==0&&y-downleft>=5&&x+downleft<=20&&UI.systemnum[x-upright][y+upright]==0&&y+upright<=20&&x-upright>=5) {
										ipoint+=4;
									}
									else if(UI.systemnum[x+downleft][y-downleft]==3&&y-downleft>=5&&x+downleft<=20&&UI.systemnum[x-upright][y+upright]==0&&y+upright<=20&&x-upright>=5) {
										ipoint+=2;
									}
									else if(UI.systemnum[x+downleft][y-downleft]==0&&y-downleft>=5&&x+downleft<=20&&UI.systemnum[x-upright][y+upright]==3&&y+upright<=20&&x-upright>=5) {
										ipoint+=2;
									}
									else if(y-downleft<5&&x+downleft>20&&UI.systemnum[x-upright][y+upright]==0&&y+upright<=20&&x-upright>=5) {
										ipoint+=2;
									}
									else if(UI.systemnum[x+downleft][y-downleft]==0&&y-downleft>=5&&x+downleft<=20&&y+upright>20&&x-upright<5) {
										ipoint+=2;
									}
								}
							}
							
						}
					}
					point[p][q]+=ipoint;
					UI.systemnum[p][q]=0;
				}
				else point[p][q]+=-666;
			}
		}
		return point;
	}*/
	
	public static int iswin() {
		int times=0;
		for(int x=5;x<20;x++) {
			for(int y=5;y<20;y++) {
				if(UI.systemnum[x][y]==0)times++;
				if(UI.systemnum[x][y]==3) {
					
					int up=1;
					int down=1;
					int left=1;
					int right=1;
					int upleft=1;
					int upright=1;
					int downleft=1;
					int downright=1;
					
					//从当前格子向各个方向蔓延，计算这个格子和附近格子产生的连珠情况
					for(int cd=0;cd<5;cd++) {	
						
						if(UI.systemnum[x-up][y]==3) up++;
						
						if(UI.systemnum[x+down][y]==3)down++;
						
						if(UI.systemnum[x][y-left]==3)left++;
						
						if(UI.systemnum[x][y+right]==3)right++;
						
						if(UI.systemnum[x-upleft][y-upleft]==3)upleft++;
						
						if(UI.systemnum[x+downright][y+downright]==3)downright++;
						
						if(UI.systemnum[x-upright][y+upright]==3)upright++;
						
						if(UI.systemnum[x+downleft][y-downleft]==3)downleft++;
					}
					
					if(up+down>=6||left+right>=6||upleft+downright>=6||upright+downleft>=6) {
						UI.str.setText("恭喜你取得了本场比赛的胜利");
						UI.newgame.setVisible(true);
						return 3;
					}
					
				}
				else if(UI.systemnum[x][y]==7) {
					int up=1;
					int down=1;
					int left=1;
					int right=1;
					int upleft=1;
					int upright=1;
					int downleft=1;
					int downright=1;
					
					//从当前格子向各个方向蔓延，计算这个格子和附近格子产生的连珠情况
					for(int cd=0;cd<5;cd++) {	
						
						if(UI.systemnum[x-up][y]==7) up++;
						
						if(UI.systemnum[x+down][y]==7)down++;
						
						if(UI.systemnum[x][y-left]==7)left++;
						
						if(UI.systemnum[x][y+right]==7)right++;
						
						if(UI.systemnum[x-upleft][y-upleft]==7)upleft++;
						
						if(UI.systemnum[x+downright][y+downright]==7)downright++;
						
						if(UI.systemnum[x-upright][y+upright]==7)upright++;
						
						if(UI.systemnum[x+downleft][y-downleft]==7)downleft++;
					}
					
					if(up+down>=6||left+right>=6||upleft+downright>=6||upright+downleft>=6) {
						UI.str.setText("机器人取得了本场比赛的胜利。");
						UI.newgame.setVisible(true);
						return 3;
					}
				}
			}
		}
		if(times<=0) {
			UI.str.setText("双方平局 ！");
			UI.newgame.setVisible(true);
			return 3;
		}
		return 0;
	}
	
	
	public static void upup(int[][]point,JFrame frame) {
		int max=-1000;
		for(int x=5;x<20;x++) {
			for(int y=5;y<20;y++) {
				if(point[x][y]>=max)max=point[x][y];
			}
		}
		for(int p=5;p<20;p++) {
			for(int q=5;q<20;q++) {
				if(point[p][q]==max) {
					downimg(p,q,frame);
					return;
				}
			}
		}
		
	}

	private static void downimg(int p, int q, JFrame frame) {
		ImageIcon whi=new ImageIcon("D:/Documents/training/白棋.png");
		UI.systemnum[p][q]=7;
		p-=4;
		q-=4;
		if(p==1&&q==1){
			Qipan.q11img.setIcon(whi);
			Qipan.q11img.setVisible(true);
			Qipan.q11.setVisible(false);
			frame.setVisible(true);
			}
			if(p==1&&q==2){
			Qipan.q12img.setIcon(whi);
			Qipan.q12img.setVisible(true);
			Qipan.q12.setVisible(false);
			frame.setVisible(true);
			}
			if(p==1&&q==3){
			Qipan.q13img.setIcon(whi);
			Qipan.q13img.setVisible(true);
			Qipan.q13.setVisible(false);
			frame.setVisible(true);
			}
			if(p==1&&q==4){
			Qipan.q14img.setIcon(whi);
			Qipan.q14img.setVisible(true);
			Qipan.q14.setVisible(false);
			frame.setVisible(true);
			}
			if(p==1&&q==5){
			Qipan.q15img.setIcon(whi);
			Qipan.q15img.setVisible(true);
			Qipan.q15.setVisible(false);
			frame.setVisible(true);
			}
			if(p==1&&q==6){
			Qipan.q16img.setIcon(whi);
			Qipan.q16img.setVisible(true);
			Qipan.q16.setVisible(false);
			frame.setVisible(true);
			}
			if(p==1&&q==7){
			Qipan.q17img.setIcon(whi);
			Qipan.q17img.setVisible(true);
			Qipan.q17.setVisible(false);
			frame.setVisible(true);
			}
			if(p==1&&q==8){
			Qipan.q18img.setIcon(whi);
			Qipan.q18img.setVisible(true);
			Qipan.q18.setVisible(false);
			frame.setVisible(true);
			}
			if(p==1&&q==9){
			Qipan.q19img.setIcon(whi);
			Qipan.q19img.setVisible(true);
			Qipan.q19.setVisible(false);
			frame.setVisible(true);
			}
			if(p==1&&q==10){
			Qipan.q110img.setIcon(whi);
			Qipan.q110img.setVisible(true);
			Qipan.q110.setVisible(false);
			frame.setVisible(true);
			}
			if(p==1&&q==11){
			Qipan.q111img.setIcon(whi);
			Qipan.q111img.setVisible(true);
			Qipan.q111.setVisible(false);
			frame.setVisible(true);
			}
			if(p==1&&q==12){
			Qipan.q112img.setIcon(whi);
			Qipan.q112img.setVisible(true);
			Qipan.q112.setVisible(false);
			frame.setVisible(true);
			}
			if(p==1&&q==13){
			Qipan.q113img.setIcon(whi);
			Qipan.q113img.setVisible(true);
			Qipan.q113.setVisible(false);
			frame.setVisible(true);
			}
			if(p==1&&q==14){
			Qipan.q114img.setIcon(whi);
			Qipan.q114img.setVisible(true);
			Qipan.q114.setVisible(false);
			frame.setVisible(true);
			}
			if(p==1&&q==15){
			Qipan.q115img.setIcon(whi);
			Qipan.q115img.setVisible(true);
			Qipan.q115.setVisible(false);
			frame.setVisible(true);
			}
			if(p==2&&q==1){
			Qipan.q21img.setIcon(whi);
			Qipan.q21img.setVisible(true);
			Qipan.q21.setVisible(false);
			frame.setVisible(true);
			}
			if(p==2&&q==2){
			Qipan.q22img.setIcon(whi);
			Qipan.q22img.setVisible(true);
			Qipan.q22.setVisible(false);
			frame.setVisible(true);
			}
			if(p==2&&q==3){
			Qipan.q23img.setIcon(whi);
			Qipan.q23img.setVisible(true);
			Qipan.q23.setVisible(false);
			frame.setVisible(true);
			}
			if(p==2&&q==4){
			Qipan.q24img.setIcon(whi);
			Qipan.q24img.setVisible(true);
			Qipan.q24.setVisible(false);
			frame.setVisible(true);
			}
			if(p==2&&q==5){
			Qipan.q25img.setIcon(whi);
			Qipan.q25img.setVisible(true);
			Qipan.q25.setVisible(false);
			frame.setVisible(true);
			}
			if(p==2&&q==6){
			Qipan.q26img.setIcon(whi);
			Qipan.q26img.setVisible(true);
			Qipan.q26.setVisible(false);
			frame.setVisible(true);
			}
			if(p==2&&q==7){
			Qipan.q27img.setIcon(whi);
			Qipan.q27img.setVisible(true);
			Qipan.q27.setVisible(false);
			frame.setVisible(true);
			}
			if(p==2&&q==8){
			Qipan.q28img.setIcon(whi);
			Qipan.q28img.setVisible(true);
			Qipan.q28.setVisible(false);
			frame.setVisible(true);
			}
			if(p==2&&q==9){
			Qipan.q29img.setIcon(whi);
			Qipan.q29img.setVisible(true);
			Qipan.q29.setVisible(false);
			frame.setVisible(true);
			}
			if(p==2&&q==10){
			Qipan.q210img.setIcon(whi);
			Qipan.q210img.setVisible(true);
			Qipan.q210.setVisible(false);
			frame.setVisible(true);
			}
			if(p==2&&q==11){
			Qipan.q211img.setIcon(whi);
			Qipan.q211img.setVisible(true);
			Qipan.q211.setVisible(false);
			frame.setVisible(true);
			}
			if(p==2&&q==12){
			Qipan.q212img.setIcon(whi);
			Qipan.q212img.setVisible(true);
			Qipan.q212.setVisible(false);
			frame.setVisible(true);
			}
			if(p==2&&q==13){
			Qipan.q213img.setIcon(whi);
			Qipan.q213img.setVisible(true);
			Qipan.q213.setVisible(false);
			frame.setVisible(true);
			}
			if(p==2&&q==14){
			Qipan.q214img.setIcon(whi);
			Qipan.q214img.setVisible(true);
			Qipan.q214.setVisible(false);
			frame.setVisible(true);
			}
			if(p==2&&q==15){
			Qipan.q215img.setIcon(whi);
			Qipan.q215img.setVisible(true);
			Qipan.q215.setVisible(false);
			frame.setVisible(true);
			}
			if(p==3&&q==1){
			Qipan.q31img.setIcon(whi);
			Qipan.q31img.setVisible(true);
			Qipan.q31.setVisible(false);
			frame.setVisible(true);
			}
			if(p==3&&q==2){
			Qipan.q32img.setIcon(whi);
			Qipan.q32img.setVisible(true);
			Qipan.q32.setVisible(false);
			frame.setVisible(true);
			}
			if(p==3&&q==3){
			Qipan.q33img.setIcon(whi);
			Qipan.q33img.setVisible(true);
			Qipan.q33.setVisible(false);
			frame.setVisible(true);
			}
			if(p==3&&q==4){
			Qipan.q34img.setIcon(whi);
			Qipan.q34img.setVisible(true);
			Qipan.q34.setVisible(false);
			frame.setVisible(true);
			}
			if(p==3&&q==5){
			Qipan.q35img.setIcon(whi);
			Qipan.q35img.setVisible(true);
			Qipan.q35.setVisible(false);
			frame.setVisible(true);
			}
			if(p==3&&q==6){
			Qipan.q36img.setIcon(whi);
			Qipan.q36img.setVisible(true);
			Qipan.q36.setVisible(false);
			frame.setVisible(true);
			}
			if(p==3&&q==7){
			Qipan.q37img.setIcon(whi);
			Qipan.q37img.setVisible(true);
			Qipan.q37.setVisible(false);
			frame.setVisible(true);
			}
			if(p==3&&q==8){
			Qipan.q38img.setIcon(whi);
			Qipan.q38img.setVisible(true);
			Qipan.q38.setVisible(false);
			frame.setVisible(true);
			}
			if(p==3&&q==9){
			Qipan.q39img.setIcon(whi);
			Qipan.q39img.setVisible(true);
			Qipan.q39.setVisible(false);
			frame.setVisible(true);
			}
			if(p==3&&q==10){
			Qipan.q310img.setIcon(whi);
			Qipan.q310img.setVisible(true);
			Qipan.q310.setVisible(false);
			frame.setVisible(true);
			}
			if(p==3&&q==11){
			Qipan.q311img.setIcon(whi);
			Qipan.q311img.setVisible(true);
			Qipan.q311.setVisible(false);
			frame.setVisible(true);
			}
			if(p==3&&q==12){
			Qipan.q312img.setIcon(whi);
			Qipan.q312img.setVisible(true);
			Qipan.q312.setVisible(false);
			frame.setVisible(true);
			}
			if(p==3&&q==13){
			Qipan.q313img.setIcon(whi);
			Qipan.q313img.setVisible(true);
			Qipan.q313.setVisible(false);
			frame.setVisible(true);
			}
			if(p==3&&q==14){
			Qipan.q314img.setIcon(whi);
			Qipan.q314img.setVisible(true);
			Qipan.q314.setVisible(false);
			frame.setVisible(true);
			}
			if(p==3&&q==15){
			Qipan.q315img.setIcon(whi);
			Qipan.q315img.setVisible(true);
			Qipan.q315.setVisible(false);
			frame.setVisible(true);
			}
			if(p==4&&q==1){
			Qipan.q41img.setIcon(whi);
			Qipan.q41img.setVisible(true);
			Qipan.q41.setVisible(false);
			frame.setVisible(true);
			}
			if(p==4&&q==2){
			Qipan.q42img.setIcon(whi);
			Qipan.q42img.setVisible(true);
			Qipan.q42.setVisible(false);
			frame.setVisible(true);
			}
			if(p==4&&q==3){
			Qipan.q43img.setIcon(whi);
			Qipan.q43img.setVisible(true);
			Qipan.q43.setVisible(false);
			frame.setVisible(true);
			}
			if(p==4&&q==4){
			Qipan.q44img.setIcon(whi);
			Qipan.q44img.setVisible(true);
			Qipan.q44.setVisible(false);
			frame.setVisible(true);
			}
			if(p==4&&q==5){
			Qipan.q45img.setIcon(whi);
			Qipan.q45img.setVisible(true);
			Qipan.q45.setVisible(false);
			frame.setVisible(true);
			}
			if(p==4&&q==6){
			Qipan.q46img.setIcon(whi);
			Qipan.q46img.setVisible(true);
			Qipan.q46.setVisible(false);
			frame.setVisible(true);
			}
			if(p==4&&q==7){
			Qipan.q47img.setIcon(whi);
			Qipan.q47img.setVisible(true);
			Qipan.q47.setVisible(false);
			frame.setVisible(true);
			}
			if(p==4&&q==8){
			Qipan.q48img.setIcon(whi);
			Qipan.q48img.setVisible(true);
			Qipan.q48.setVisible(false);
			frame.setVisible(true);
			}
			if(p==4&&q==9){
			Qipan.q49img.setIcon(whi);
			Qipan.q49img.setVisible(true);
			Qipan.q49.setVisible(false);
			frame.setVisible(true);
			}
			if(p==4&&q==10){
			Qipan.q410img.setIcon(whi);
			Qipan.q410img.setVisible(true);
			Qipan.q410.setVisible(false);
			frame.setVisible(true);
			}
			if(p==4&&q==11){
			Qipan.q411img.setIcon(whi);
			Qipan.q411img.setVisible(true);
			Qipan.q411.setVisible(false);
			frame.setVisible(true);
			}
			if(p==4&&q==12){
			Qipan.q412img.setIcon(whi);
			Qipan.q412img.setVisible(true);
			Qipan.q412.setVisible(false);
			frame.setVisible(true);
			}
			if(p==4&&q==13){
			Qipan.q413img.setIcon(whi);
			Qipan.q413img.setVisible(true);
			Qipan.q413.setVisible(false);
			frame.setVisible(true);
			}
			if(p==4&&q==14){
			Qipan.q414img.setIcon(whi);
			Qipan.q414img.setVisible(true);
			Qipan.q414.setVisible(false);
			frame.setVisible(true);
			}
			if(p==4&&q==15){
			Qipan.q415img.setIcon(whi);
			Qipan.q415img.setVisible(true);
			Qipan.q415.setVisible(false);
			frame.setVisible(true);
			}
			if(p==5&&q==1){
			Qipan.q51img.setIcon(whi);
			Qipan.q51img.setVisible(true);
			Qipan.q51.setVisible(false);
			frame.setVisible(true);
			}
			if(p==5&&q==2){
			Qipan.q52img.setIcon(whi);
			Qipan.q52img.setVisible(true);
			Qipan.q52.setVisible(false);
			frame.setVisible(true);
			}
			if(p==5&&q==3){
			Qipan.q53img.setIcon(whi);
			Qipan.q53img.setVisible(true);
			Qipan.q53.setVisible(false);
			frame.setVisible(true);
			}
			if(p==5&&q==4){
			Qipan.q54img.setIcon(whi);
			Qipan.q54img.setVisible(true);
			Qipan.q54.setVisible(false);
			frame.setVisible(true);
			}
			if(p==5&&q==5){
			Qipan.q55img.setIcon(whi);
			Qipan.q55img.setVisible(true);
			Qipan.q55.setVisible(false);
			frame.setVisible(true);
			}
			if(p==5&&q==6){
			Qipan.q56img.setIcon(whi);
			Qipan.q56img.setVisible(true);
			Qipan.q56.setVisible(false);
			frame.setVisible(true);
			}
			if(p==5&&q==7){
			Qipan.q57img.setIcon(whi);
			Qipan.q57img.setVisible(true);
			Qipan.q57.setVisible(false);
			frame.setVisible(true);
			}
			if(p==5&&q==8){
			Qipan.q58img.setIcon(whi);
			Qipan.q58img.setVisible(true);
			Qipan.q58.setVisible(false);
			frame.setVisible(true);
			}
			if(p==5&&q==9){
			Qipan.q59img.setIcon(whi);
			Qipan.q59img.setVisible(true);
			Qipan.q59.setVisible(false);
			frame.setVisible(true);
			}
			if(p==5&&q==10){
			Qipan.q510img.setIcon(whi);
			Qipan.q510img.setVisible(true);
			Qipan.q510.setVisible(false);
			frame.setVisible(true);
			}
			if(p==5&&q==11){
			Qipan.q511img.setIcon(whi);
			Qipan.q511img.setVisible(true);
			Qipan.q511.setVisible(false);
			frame.setVisible(true);
			}
			if(p==5&&q==12){
			Qipan.q512img.setIcon(whi);
			Qipan.q512img.setVisible(true);
			Qipan.q512.setVisible(false);
			frame.setVisible(true);
			}
			if(p==5&&q==13){
			Qipan.q513img.setIcon(whi);
			Qipan.q513img.setVisible(true);
			Qipan.q513.setVisible(false);
			frame.setVisible(true);
			}
			if(p==5&&q==14){
			Qipan.q514img.setIcon(whi);
			Qipan.q514img.setVisible(true);
			Qipan.q514.setVisible(false);
			frame.setVisible(true);
			}
			if(p==5&&q==15){
			Qipan.q515img.setIcon(whi);
			Qipan.q515img.setVisible(true);
			Qipan.q515.setVisible(false);
			frame.setVisible(true);
			}
			if(p==6&&q==1){
			Qipan.q61img.setIcon(whi);
			Qipan.q61img.setVisible(true);
			Qipan.q61.setVisible(false);
			frame.setVisible(true);
			}
			if(p==6&&q==2){
			Qipan.q62img.setIcon(whi);
			Qipan.q62img.setVisible(true);
			Qipan.q62.setVisible(false);
			frame.setVisible(true);
			}
			if(p==6&&q==3){
			Qipan.q63img.setIcon(whi);
			Qipan.q63img.setVisible(true);
			Qipan.q63.setVisible(false);
			frame.setVisible(true);
			}
			if(p==6&&q==4){
			Qipan.q64img.setIcon(whi);
			Qipan.q64img.setVisible(true);
			Qipan.q64.setVisible(false);
			frame.setVisible(true);
			}
			if(p==6&&q==5){
			Qipan.q65img.setIcon(whi);
			Qipan.q65img.setVisible(true);
			Qipan.q65.setVisible(false);
			frame.setVisible(true);
			}
			if(p==6&&q==6){
			Qipan.q66img.setIcon(whi);
			Qipan.q66img.setVisible(true);
			Qipan.q66.setVisible(false);
			frame.setVisible(true);
			}
			if(p==6&&q==7){
			Qipan.q67img.setIcon(whi);
			Qipan.q67img.setVisible(true);
			Qipan.q67.setVisible(false);
			frame.setVisible(true);
			}
			if(p==6&&q==8){
			Qipan.q68img.setIcon(whi);
			Qipan.q68img.setVisible(true);
			Qipan.q68.setVisible(false);
			frame.setVisible(true);
			}
			if(p==6&&q==9){
			Qipan.q69img.setIcon(whi);
			Qipan.q69img.setVisible(true);
			Qipan.q69.setVisible(false);
			frame.setVisible(true);
			}
			if(p==6&&q==10){
			Qipan.q610img.setIcon(whi);
			Qipan.q610img.setVisible(true);
			Qipan.q610.setVisible(false);
			frame.setVisible(true);
			}
			if(p==6&&q==11){
			Qipan.q611img.setIcon(whi);
			Qipan.q611img.setVisible(true);
			Qipan.q611.setVisible(false);
			frame.setVisible(true);
			}
			if(p==6&&q==12){
			Qipan.q612img.setIcon(whi);
			Qipan.q612img.setVisible(true);
			Qipan.q612.setVisible(false);
			frame.setVisible(true);
			}
			if(p==6&&q==13){
			Qipan.q613img.setIcon(whi);
			Qipan.q613img.setVisible(true);
			Qipan.q613.setVisible(false);
			frame.setVisible(true);
			}
			if(p==6&&q==14){
			Qipan.q614img.setIcon(whi);
			Qipan.q614img.setVisible(true);
			Qipan.q614.setVisible(false);
			frame.setVisible(true);
			}
			if(p==6&&q==15){
			Qipan.q615img.setIcon(whi);
			Qipan.q615img.setVisible(true);
			Qipan.q615.setVisible(false);
			frame.setVisible(true);
			}
			if(p==7&&q==1){
			Qipan.q71img.setIcon(whi);
			Qipan.q71img.setVisible(true);
			Qipan.q71.setVisible(false);
			frame.setVisible(true);
			}
			if(p==7&&q==2){
			Qipan.q72img.setIcon(whi);
			Qipan.q72img.setVisible(true);
			Qipan.q72.setVisible(false);
			frame.setVisible(true);
			}
			if(p==7&&q==3){
			Qipan.q73img.setIcon(whi);
			Qipan.q73img.setVisible(true);
			Qipan.q73.setVisible(false);
			frame.setVisible(true);
			}
			if(p==7&&q==4){
			Qipan.q74img.setIcon(whi);
			Qipan.q74img.setVisible(true);
			Qipan.q74.setVisible(false);
			frame.setVisible(true);
			}
			if(p==7&&q==5){
			Qipan.q75img.setIcon(whi);
			Qipan.q75img.setVisible(true);
			Qipan.q75.setVisible(false);
			frame.setVisible(true);
			}
			if(p==7&&q==6){
			Qipan.q76img.setIcon(whi);
			Qipan.q76img.setVisible(true);
			Qipan.q76.setVisible(false);
			frame.setVisible(true);
			}
			if(p==7&&q==7){
			Qipan.q77img.setIcon(whi);
			Qipan.q77img.setVisible(true);
			Qipan.q77.setVisible(false);
			frame.setVisible(true);
			}
			if(p==7&&q==8){
			Qipan.q78img.setIcon(whi);
			Qipan.q78img.setVisible(true);
			Qipan.q78.setVisible(false);
			frame.setVisible(true);
			}
			if(p==7&&q==9){
			Qipan.q79img.setIcon(whi);
			Qipan.q79img.setVisible(true);
			Qipan.q79.setVisible(false);
			frame.setVisible(true);
			}
			if(p==7&&q==10){
			Qipan.q710img.setIcon(whi);
			Qipan.q710img.setVisible(true);
			Qipan.q710.setVisible(false);
			frame.setVisible(true);
			}
			if(p==7&&q==11){
			Qipan.q711img.setIcon(whi);
			Qipan.q711img.setVisible(true);
			Qipan.q711.setVisible(false);
			frame.setVisible(true);
			}
			if(p==7&&q==12){
			Qipan.q712img.setIcon(whi);
			Qipan.q712img.setVisible(true);
			Qipan.q712.setVisible(false);
			frame.setVisible(true);
			}
			if(p==7&&q==13){
			Qipan.q713img.setIcon(whi);
			Qipan.q713img.setVisible(true);
			Qipan.q713.setVisible(false);
			frame.setVisible(true);
			}
			if(p==7&&q==14){
			Qipan.q714img.setIcon(whi);
			Qipan.q714img.setVisible(true);
			Qipan.q714.setVisible(false);
			frame.setVisible(true);
			}
			if(p==7&&q==15){
			Qipan.q715img.setIcon(whi);
			Qipan.q715img.setVisible(true);
			Qipan.q715.setVisible(false);
			frame.setVisible(true);
			}
			if(p==8&&q==1){
			Qipan.q81img.setIcon(whi);
			Qipan.q81img.setVisible(true);
			Qipan.q81.setVisible(false);
			frame.setVisible(true);
			}
			if(p==8&&q==2){
			Qipan.q82img.setIcon(whi);
			Qipan.q82img.setVisible(true);
			Qipan.q82.setVisible(false);
			frame.setVisible(true);
			}
			if(p==8&&q==3){
			Qipan.q83img.setIcon(whi);
			Qipan.q83img.setVisible(true);
			Qipan.q83.setVisible(false);
			frame.setVisible(true);
			}
			if(p==8&&q==4){
			Qipan.q84img.setIcon(whi);
			Qipan.q84img.setVisible(true);
			Qipan.q84.setVisible(false);
			frame.setVisible(true);
			}
			if(p==8&&q==5){
			Qipan.q85img.setIcon(whi);
			Qipan.q85img.setVisible(true);
			Qipan.q85.setVisible(false);
			frame.setVisible(true);
			}
			if(p==8&&q==6){
			Qipan.q86img.setIcon(whi);
			Qipan.q86img.setVisible(true);
			Qipan.q86.setVisible(false);
			frame.setVisible(true);
			}
			if(p==8&&q==7){
			Qipan.q87img.setIcon(whi);
			Qipan.q87img.setVisible(true);
			Qipan.q87.setVisible(false);
			frame.setVisible(true);
			}
			if(p==8&&q==8){
			Qipan.q88img.setIcon(whi);
			Qipan.q88img.setVisible(true);
			Qipan.q88.setVisible(false);
			frame.setVisible(true);
			}
			if(p==8&&q==9){
			Qipan.q89img.setIcon(whi);
			Qipan.q89img.setVisible(true);
			Qipan.q89.setVisible(false);
			frame.setVisible(true);
			}
			if(p==8&&q==10){
			Qipan.q810img.setIcon(whi);
			Qipan.q810img.setVisible(true);
			Qipan.q810.setVisible(false);
			frame.setVisible(true);
			}
			if(p==8&&q==11){
			Qipan.q811img.setIcon(whi);
			Qipan.q811img.setVisible(true);
			Qipan.q811.setVisible(false);
			frame.setVisible(true);
			}
			if(p==8&&q==12){
			Qipan.q812img.setIcon(whi);
			Qipan.q812img.setVisible(true);
			Qipan.q812.setVisible(false);
			frame.setVisible(true);
			}
			if(p==8&&q==13){
			Qipan.q813img.setIcon(whi);
			Qipan.q813img.setVisible(true);
			Qipan.q813.setVisible(false);
			frame.setVisible(true);
			}
			if(p==8&&q==14){
			Qipan.q814img.setIcon(whi);
			Qipan.q814img.setVisible(true);
			Qipan.q814.setVisible(false);
			frame.setVisible(true);
			}
			if(p==8&&q==15){
			Qipan.q815img.setIcon(whi);
			Qipan.q815img.setVisible(true);
			Qipan.q815.setVisible(false);
			frame.setVisible(true);
			}
			if(p==9&&q==1){
			Qipan.q91img.setIcon(whi);
			Qipan.q91img.setVisible(true);
			Qipan.q91.setVisible(false);
			frame.setVisible(true);
			}
			if(p==9&&q==2){
			Qipan.q92img.setIcon(whi);
			Qipan.q92img.setVisible(true);
			Qipan.q92.setVisible(false);
			frame.setVisible(true);
			}
			if(p==9&&q==3){
			Qipan.q93img.setIcon(whi);
			Qipan.q93img.setVisible(true);
			Qipan.q93.setVisible(false);
			frame.setVisible(true);
			}
			if(p==9&&q==4){
			Qipan.q94img.setIcon(whi);
			Qipan.q94img.setVisible(true);
			Qipan.q94.setVisible(false);
			frame.setVisible(true);
			}
			if(p==9&&q==5){
			Qipan.q95img.setIcon(whi);
			Qipan.q95img.setVisible(true);
			Qipan.q95.setVisible(false);
			frame.setVisible(true);
			}
			if(p==9&&q==6){
			Qipan.q96img.setIcon(whi);
			Qipan.q96img.setVisible(true);
			Qipan.q96.setVisible(false);
			frame.setVisible(true);
			}
			if(p==9&&q==7){
			Qipan.q97img.setIcon(whi);
			Qipan.q97img.setVisible(true);
			Qipan.q97.setVisible(false);
			frame.setVisible(true);
			}
			if(p==9&&q==8){
			Qipan.q98img.setIcon(whi);
			Qipan.q98img.setVisible(true);
			Qipan.q98.setVisible(false);
			frame.setVisible(true);
			}
			if(p==9&&q==9){
			Qipan.q99img.setIcon(whi);
			Qipan.q99img.setVisible(true);
			Qipan.q99.setVisible(false);
			frame.setVisible(true);
			}
			if(p==9&&q==10){
			Qipan.q910img.setIcon(whi);
			Qipan.q910img.setVisible(true);
			Qipan.q910.setVisible(false);
			frame.setVisible(true);
			}
			if(p==9&&q==11){
			Qipan.q911img.setIcon(whi);
			Qipan.q911img.setVisible(true);
			Qipan.q911.setVisible(false);
			frame.setVisible(true);
			}
			if(p==9&&q==12){
			Qipan.q912img.setIcon(whi);
			Qipan.q912img.setVisible(true);
			Qipan.q912.setVisible(false);
			frame.setVisible(true);
			}
			if(p==9&&q==13){
			Qipan.q913img.setIcon(whi);
			Qipan.q913img.setVisible(true);
			Qipan.q913.setVisible(false);
			frame.setVisible(true);
			}
			if(p==9&&q==14){
			Qipan.q914img.setIcon(whi);
			Qipan.q914img.setVisible(true);
			Qipan.q914.setVisible(false);
			frame.setVisible(true);
			}
			if(p==9&&q==15){
			Qipan.q915img.setIcon(whi);
			Qipan.q915img.setVisible(true);
			Qipan.q915.setVisible(false);
			frame.setVisible(true);
			}

			if(p==10&&q==1){
				Qipan.q1001img.setIcon(whi);
				Qipan.q1001img.setVisible(true);
				Qipan.q1001.setVisible(false);
				frame.setVisible(true);
				}if(p==10&&q==2){
				Qipan.q1002img.setIcon(whi);
				Qipan.q1002img.setVisible(true);
				Qipan.q1002.setVisible(false);
				frame.setVisible(true);
				}if(p==10&&q==3){
				Qipan.q1003img.setIcon(whi);
				Qipan.q1003img.setVisible(true);
				Qipan.q1003.setVisible(false);
				frame.setVisible(true);
				}if(p==10&&q==4){
				Qipan.q1004img.setIcon(whi);
				Qipan.q1004img.setVisible(true);
				Qipan.q1004.setVisible(false);
				frame.setVisible(true);
				}if(p==10&&q==5){
				Qipan.q1005img.setIcon(whi);
				Qipan.q1005img.setVisible(true);
				Qipan.q1005.setVisible(false);
				frame.setVisible(true);
				}if(p==10&&q==6){
				Qipan.q1006img.setIcon(whi);
				Qipan.q1006img.setVisible(true);
				Qipan.q1006.setVisible(false);
				frame.setVisible(true);
				}if(p==10&&q==7){
				Qipan.q1007img.setIcon(whi);
				Qipan.q1007img.setVisible(true);
				Qipan.q1007.setVisible(false);
				frame.setVisible(true);
				}if(p==10&&q==8){
				Qipan.q1008img.setIcon(whi);
				Qipan.q1008img.setVisible(true);
				Qipan.q1008.setVisible(false);
				frame.setVisible(true);
				}if(p==10&&q==9){
				Qipan.q1009img.setIcon(whi);
				Qipan.q1009img.setVisible(true);
				Qipan.q1009.setVisible(false);
				frame.setVisible(true);
				}if(p==10&&q==10){
				Qipan.q1010img.setIcon(whi);
				Qipan.q1010img.setVisible(true);
				Qipan.q1010.setVisible(false);
				frame.setVisible(true);
				}
				if(p==10&&q==11){
				Qipan.q1011img.setIcon(whi);
				Qipan.q1011img.setVisible(true);
				Qipan.q1011.setVisible(false);
				frame.setVisible(true);
				}
				if(p==10&&q==12){
				Qipan.q1012img.setIcon(whi);
				Qipan.q1012img.setVisible(true);
				Qipan.q1012.setVisible(false);
				frame.setVisible(true);
				}
				if(p==10&&q==13){
				Qipan.q1013img.setIcon(whi);
				Qipan.q1013img.setVisible(true);
				Qipan.q1013.setVisible(false);
				frame.setVisible(true);
				}
				if(p==10&&q==14){
				Qipan.q1014img.setIcon(whi);
				Qipan.q1014img.setVisible(true);
				Qipan.q1014.setVisible(false);
				frame.setVisible(true);
				}
				if(p==10&&q==15){
				Qipan.q1015img.setIcon(whi);
				Qipan.q1015img.setVisible(true);
				Qipan.q1015.setVisible(false);
				frame.setVisible(true);
				}
				if(p==11&&q==1){
				Qipan.q1101img.setIcon(whi);
				Qipan.q1101img.setVisible(true);
				Qipan.q1101.setVisible(false);
				frame.setVisible(true);
				}if(p==11&&q==2){
				Qipan.q1102img.setIcon(whi);
				Qipan.q1102img.setVisible(true);
				Qipan.q1102.setVisible(false);
				frame.setVisible(true);
				}if(p==11&&q==3){
				Qipan.q1103img.setIcon(whi);
				Qipan.q1103img.setVisible(true);
				Qipan.q1103.setVisible(false);
				frame.setVisible(true);
				}if(p==11&&q==4){
				Qipan.q1104img.setIcon(whi);
				Qipan.q1104img.setVisible(true);
				Qipan.q1104.setVisible(false);
				frame.setVisible(true);
				}if(p==11&&q==5){
				Qipan.q1105img.setIcon(whi);
				Qipan.q1105img.setVisible(true);
				Qipan.q1105.setVisible(false);
				frame.setVisible(true);
				}if(p==11&&q==6){
				Qipan.q1106img.setIcon(whi);
				Qipan.q1106img.setVisible(true);
				Qipan.q1106.setVisible(false);
				frame.setVisible(true);
				}if(p==11&&q==7){
				Qipan.q1107img.setIcon(whi);
				Qipan.q1107img.setVisible(true);
				Qipan.q1107.setVisible(false);
				frame.setVisible(true);
				}if(p==11&&q==8){
				Qipan.q1108img.setIcon(whi);
				Qipan.q1108img.setVisible(true);
				Qipan.q1108.setVisible(false);
				frame.setVisible(true);
				}if(p==11&&q==9){
				Qipan.q1109img.setIcon(whi);
				Qipan.q1109img.setVisible(true);
				Qipan.q1109.setVisible(false);
				frame.setVisible(true);
				}if(p==11&&q==10){
				Qipan.q1110img.setIcon(whi);
				Qipan.q1110img.setVisible(true);
				Qipan.q1110.setVisible(false);
				frame.setVisible(true);
				}
				if(p==11&&q==11){
				Qipan.q1111img.setIcon(whi);
				Qipan.q1111img.setVisible(true);
				Qipan.q1111.setVisible(false);
				frame.setVisible(true);
				}
				if(p==11&&q==12){
				Qipan.q1112img.setIcon(whi);
				Qipan.q1112img.setVisible(true);
				Qipan.q1112.setVisible(false);
				frame.setVisible(true);
				}
				if(p==11&&q==13){
				Qipan.q1113img.setIcon(whi);
				Qipan.q1113img.setVisible(true);
				Qipan.q1113.setVisible(false);
				frame.setVisible(true);
				}
				if(p==11&&q==14){
				Qipan.q1114img.setIcon(whi);
				Qipan.q1114img.setVisible(true);
				Qipan.q1114.setVisible(false);
				frame.setVisible(true);
				}
				if(p==11&&q==15){
				Qipan.q1115img.setIcon(whi);
				Qipan.q1115img.setVisible(true);
				Qipan.q1115.setVisible(false);
				frame.setVisible(true);
				}
				if(p==12&&q==1){
				Qipan.q1201img.setIcon(whi);
				Qipan.q1201img.setVisible(true);
				Qipan.q1201.setVisible(false);
				frame.setVisible(true);
				}if(p==12&&q==2){
				Qipan.q1202img.setIcon(whi);
				Qipan.q1202img.setVisible(true);
				Qipan.q1202.setVisible(false);
				frame.setVisible(true);
				}if(p==12&&q==3){
				Qipan.q1203img.setIcon(whi);
				Qipan.q1203img.setVisible(true);
				Qipan.q1203.setVisible(false);
				frame.setVisible(true);
				}if(p==12&&q==4){
				Qipan.q1204img.setIcon(whi);
				Qipan.q1204img.setVisible(true);
				Qipan.q1204.setVisible(false);
				frame.setVisible(true);
				}if(p==12&&q==5){
				Qipan.q1205img.setIcon(whi);
				Qipan.q1205img.setVisible(true);
				Qipan.q1205.setVisible(false);
				frame.setVisible(true);
				}if(p==12&&q==6){
				Qipan.q1206img.setIcon(whi);
				Qipan.q1206img.setVisible(true);
				Qipan.q1206.setVisible(false);
				frame.setVisible(true);
				}if(p==12&&q==7){
				Qipan.q1207img.setIcon(whi);
				Qipan.q1207img.setVisible(true);
				Qipan.q1207.setVisible(false);
				frame.setVisible(true);
				}if(p==12&&q==8){
				Qipan.q1208img.setIcon(whi);
				Qipan.q1208img.setVisible(true);
				Qipan.q1208.setVisible(false);
				frame.setVisible(true);
				}if(p==12&&q==9){
				Qipan.q1209img.setIcon(whi);
				Qipan.q1209img.setVisible(true);
				Qipan.q1209.setVisible(false);
				frame.setVisible(true);
				}if(p==12&&q==10){
				Qipan.q1210img.setIcon(whi);
				Qipan.q1210img.setVisible(true);
				Qipan.q1210.setVisible(false);
				frame.setVisible(true);
				}
				if(p==12&&q==11){
				Qipan.q1211img.setIcon(whi);
				Qipan.q1211img.setVisible(true);
				Qipan.q1211.setVisible(false);
				frame.setVisible(true);
				}
				if(p==12&&q==12){
				Qipan.q1212img.setIcon(whi);
				Qipan.q1212img.setVisible(true);
				Qipan.q1212.setVisible(false);
				frame.setVisible(true);
				}
				if(p==12&&q==13){
				Qipan.q1213img.setIcon(whi);
				Qipan.q1213img.setVisible(true);
				Qipan.q1213.setVisible(false);
				frame.setVisible(true);
				}
				if(p==12&&q==14){
				Qipan.q1214img.setIcon(whi);
				Qipan.q1214img.setVisible(true);
				Qipan.q1214.setVisible(false);
				frame.setVisible(true);
				}
				if(p==12&&q==15){
				Qipan.q1215img.setIcon(whi);
				Qipan.q1215img.setVisible(true);
				Qipan.q1215.setVisible(false);
				frame.setVisible(true);
				}
				if(p==13&&q==1){
				Qipan.q1301img.setIcon(whi);
				Qipan.q1301img.setVisible(true);
				Qipan.q1301.setVisible(false);
				frame.setVisible(true);
				}if(p==13&&q==2){
				Qipan.q1302img.setIcon(whi);
				Qipan.q1302img.setVisible(true);
				Qipan.q1302.setVisible(false);
				frame.setVisible(true);
				}if(p==13&&q==3){
				Qipan.q1303img.setIcon(whi);
				Qipan.q1303img.setVisible(true);
				Qipan.q1303.setVisible(false);
				frame.setVisible(true);
				}if(p==13&&q==4){
				Qipan.q1304img.setIcon(whi);
				Qipan.q1304img.setVisible(true);
				Qipan.q1304.setVisible(false);
				frame.setVisible(true);
				}if(p==13&&q==5){
				Qipan.q1305img.setIcon(whi);
				Qipan.q1305img.setVisible(true);
				Qipan.q1305.setVisible(false);
				frame.setVisible(true);
				}if(p==13&&q==6){
				Qipan.q1306img.setIcon(whi);
				Qipan.q1306img.setVisible(true);
				Qipan.q1306.setVisible(false);
				frame.setVisible(true);
				}if(p==13&&q==7){
				Qipan.q1307img.setIcon(whi);
				Qipan.q1307img.setVisible(true);
				Qipan.q1307.setVisible(false);
				frame.setVisible(true);
				}if(p==13&&q==8){
				Qipan.q1308img.setIcon(whi);
				Qipan.q1308img.setVisible(true);
				Qipan.q1308.setVisible(false);
				frame.setVisible(true);
				}if(p==13&&q==9){
				Qipan.q1309img.setIcon(whi);
				Qipan.q1309img.setVisible(true);
				Qipan.q1309.setVisible(false);
				frame.setVisible(true);
				}if(p==13&&q==10){
				Qipan.q1310img.setIcon(whi);
				Qipan.q1310img.setVisible(true);
				Qipan.q1310.setVisible(false);
				frame.setVisible(true);
				}
				if(p==13&&q==11){
				Qipan.q1311img.setIcon(whi);
				Qipan.q1311img.setVisible(true);
				Qipan.q1311.setVisible(false);
				frame.setVisible(true);
				}
				if(p==13&&q==12){
				Qipan.q1312img.setIcon(whi);
				Qipan.q1312img.setVisible(true);
				Qipan.q1312.setVisible(false);
				frame.setVisible(true);
				}
				if(p==13&&q==13){
				Qipan.q1313img.setIcon(whi);
				Qipan.q1313img.setVisible(true);
				Qipan.q1313.setVisible(false);
				frame.setVisible(true);
				}
				if(p==13&&q==14){
				Qipan.q1314img.setIcon(whi);
				Qipan.q1314img.setVisible(true);
				Qipan.q1314.setVisible(false);
				frame.setVisible(true);
				}
				if(p==13&&q==15){
				Qipan.q1315img.setIcon(whi);
				Qipan.q1315img.setVisible(true);
				Qipan.q1315.setVisible(false);
				frame.setVisible(true);
				}
				if(p==14&&q==1){
				Qipan.q1401img.setIcon(whi);
				Qipan.q1401img.setVisible(true);
				Qipan.q1401.setVisible(false);
				frame.setVisible(true);
				}if(p==14&&q==2){
				Qipan.q1402img.setIcon(whi);
				Qipan.q1402img.setVisible(true);
				Qipan.q1402.setVisible(false);
				frame.setVisible(true);
				}if(p==14&&q==3){
				Qipan.q1403img.setIcon(whi);
				Qipan.q1403img.setVisible(true);
				Qipan.q1403.setVisible(false);
				frame.setVisible(true);
				}if(p==14&&q==4){
				Qipan.q1404img.setIcon(whi);
				Qipan.q1404img.setVisible(true);
				Qipan.q1404.setVisible(false);
				frame.setVisible(true);
				}if(p==14&&q==5){
				Qipan.q1405img.setIcon(whi);
				Qipan.q1405img.setVisible(true);
				Qipan.q1405.setVisible(false);
				frame.setVisible(true);
				}if(p==14&&q==6){
				Qipan.q1406img.setIcon(whi);
				Qipan.q1406img.setVisible(true);
				Qipan.q1406.setVisible(false);
				frame.setVisible(true);
				}if(p==14&&q==7){
				Qipan.q1407img.setIcon(whi);
				Qipan.q1407img.setVisible(true);
				Qipan.q1407.setVisible(false);
				frame.setVisible(true);
				}if(p==14&&q==8){
				Qipan.q1408img.setIcon(whi);
				Qipan.q1408img.setVisible(true);
				Qipan.q1408.setVisible(false);
				frame.setVisible(true);
				}if(p==14&&q==9){
				Qipan.q1409img.setIcon(whi);
				Qipan.q1409img.setVisible(true);
				Qipan.q1409.setVisible(false);
				frame.setVisible(true);
				}if(p==14&&q==10){
				Qipan.q1410img.setIcon(whi);
				Qipan.q1410img.setVisible(true);
				Qipan.q1410.setVisible(false);
				frame.setVisible(true);
				}
				if(p==14&&q==11){
				Qipan.q1411img.setIcon(whi);
				Qipan.q1411img.setVisible(true);
				Qipan.q1411.setVisible(false);
				frame.setVisible(true);
				}
				if(p==14&&q==12){
				Qipan.q1412img.setIcon(whi);
				Qipan.q1412img.setVisible(true);
				Qipan.q1412.setVisible(false);
				frame.setVisible(true);
				}
				if(p==14&&q==13){
				Qipan.q1413img.setIcon(whi);
				Qipan.q1413img.setVisible(true);
				Qipan.q1413.setVisible(false);
				frame.setVisible(true);
				}
				if(p==14&&q==14){
				Qipan.q1414img.setIcon(whi);
				Qipan.q1414img.setVisible(true);
				Qipan.q1414.setVisible(false);
				frame.setVisible(true);
				}
				if(p==14&&q==15){
				Qipan.q1415img.setIcon(whi);
				Qipan.q1415img.setVisible(true);
				Qipan.q1415.setVisible(false);
				frame.setVisible(true);
				}
				if(p==15&&q==1){
				Qipan.q1501img.setIcon(whi);
				Qipan.q1501img.setVisible(true);
				Qipan.q1501.setVisible(false);
				frame.setVisible(true);
				}if(p==15&&q==2){
				Qipan.q1502img.setIcon(whi);
				Qipan.q1502img.setVisible(true);
				Qipan.q1502.setVisible(false);
				frame.setVisible(true);
				}if(p==15&&q==3){
				Qipan.q1503img.setIcon(whi);
				Qipan.q1503img.setVisible(true);
				Qipan.q1503.setVisible(false);
				frame.setVisible(true);
				}if(p==15&&q==4){
				Qipan.q1504img.setIcon(whi);
				Qipan.q1504img.setVisible(true);
				Qipan.q1504.setVisible(false);
				frame.setVisible(true);
				}if(p==15&&q==5){
				Qipan.q1505img.setIcon(whi);
				Qipan.q1505img.setVisible(true);
				Qipan.q1505.setVisible(false);
				frame.setVisible(true);
				}if(p==15&&q==6){
				Qipan.q1506img.setIcon(whi);
				Qipan.q1506img.setVisible(true);
				Qipan.q1506.setVisible(false);
				frame.setVisible(true);
				}if(p==15&&q==7){
				Qipan.q1507img.setIcon(whi);
				Qipan.q1507img.setVisible(true);
				Qipan.q1507.setVisible(false);
				frame.setVisible(true);
				}if(p==15&&q==8){
				Qipan.q1508img.setIcon(whi);
				Qipan.q1508img.setVisible(true);
				Qipan.q1508.setVisible(false);
				frame.setVisible(true);
				}if(p==15&&q==9){
				Qipan.q1509img.setIcon(whi);
				Qipan.q1509img.setVisible(true);
				Qipan.q1509.setVisible(false);
				frame.setVisible(true);
				}if(p==15&&q==10){
				Qipan.q1510img.setIcon(whi);
				Qipan.q1510img.setVisible(true);
				Qipan.q1510.setVisible(false);
				frame.setVisible(true);
				}
				if(p==15&&q==11){
				Qipan.q1511img.setIcon(whi);
				Qipan.q1511img.setVisible(true);
				Qipan.q1511.setVisible(false);
				frame.setVisible(true);
				}
				if(p==15&&q==12){
				Qipan.q1512img.setIcon(whi);
				Qipan.q1512img.setVisible(true);
				Qipan.q1512.setVisible(false);
				frame.setVisible(true);
				}
				if(p==15&&q==13){
				Qipan.q1513img.setIcon(whi);
				Qipan.q1513img.setVisible(true);
				Qipan.q1513.setVisible(false);
				frame.setVisible(true);
				}
				if(p==15&&q==14){
				Qipan.q1514img.setIcon(whi);
				Qipan.q1514img.setVisible(true);
				Qipan.q1514.setVisible(false);
				frame.setVisible(true);
				}
				if(p==15&&q==15){
				Qipan.q1515img.setIcon(whi);
				Qipan.q1515img.setVisible(true);
				Qipan.q1515.setVisible(false);
				frame.setVisible(true);
				}

	}
}