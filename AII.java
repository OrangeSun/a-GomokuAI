package uiGame;

import javax.swing.JFrame;

public class AII {
	/*算法上的问题都不是问题！！！
	 * 首先，求对我方最有利的点top5     成功
	 * 然后，求点击后对对面最有利的点top5 成功
	 * 再看看我方能达到的最大分数 成功
	 * 最后，比较，求最大值
	 * */

	public static void think(JFrame frame) {
		frame.setVisible(true);
		int win=AI.iswin();
		if(win==3)return;
		int[][]copy=UI.systemnum;
		int[][]point=getmine();
		point=getTop5(point,copy);
		AI.upup(point, frame);
		win=AI.iswin();
		if(win==3)return;
		UI.systemtimes=0;
		UI.str.setText("轮到你下啦。");
	}

	private static int[][] getTop5(int[][] point, int[][] copy) {
		int top1=0;
		int top2=0;
		int top3=0;
		int top4=0;
		int top5=0;
		int top1times=0;
		int top2times=0;
		int top3times=0;
		int top4times=0;
		int top5times=0;
		
		for(int x=5;x<20;x++) {
			for(int y=5;y<20;y++) {
				if(point[x][y]>top1)top1=point[x][y];
				else if(point[x][y]>top2&&point[x][y]<top1)top2=point[x][y];
				else if(point[x][y]>top3&&point[x][y]<top2)top3=point[x][y];
				else if(point[x][y]>top4&&point[x][y]<top3)top4=point[x][y];
				else if(point[x][y]>top5&&point[x][y]<top4)top5=point[x][y];
			}
		}
		if(top1<=1000) {
		for(int p=5;p<20;p++) {
			for(int q=5;q<20;q++) {
				if(point[p][q]==top1&&top1times==0) {
					copy[p][q]=7;
					point[p][q]+=getplayer(copy);
					copy[p][q]=0;
					top1times=1;
				}
				else if(top2>10&&point[p][q]==top2&&top2times==0) {
					copy[p][q]=7;
					point[p][q]+=getplayer(copy);
					copy[p][q]=0;
					top2times=1;
				}
				else if(top3>15&&point[p][q]==top3&&top3times==0) {
					copy[p][q]=7;
					point[p][q]+=getplayer(copy);
					copy[p][q]=0;
					top3times=1;
				}
				else if(top4>20&&point[p][q]==top4&&top4times==0) {
					copy[p][q]=7;
					point[p][q]+=getplayer(copy);
					copy[p][q]=0;
					top4times=1;
				}
				else if(top5>25&&point[p][q]==top5&&top5times==0) {
					copy[p][q]=7;
					point[p][q]+=getplayer(copy);
					copy[p][q]=0;
					top5times=1;
				}
			}
		}
		}
		return point;
	}

	private static int getplayer(int[][] copy) {
		//计算对面可能点击的位置top5
		int[][]point=getself2(copy);
		point=getdanger2(copy,point);
		int c=getplayertop(copy,point);
		return c;
	}

	private static int getplayertop(int[][] copy, int[][] point) {
		int top1=0;
		int top2=0;
		int top3=0;
		int top4=0;
		int top5=0;
		int top1times=0;
		int top2times=0;
		int top3times=0;
		int top4times=0;
		int top5times=0;
		int p1=0;
		int p2=0;
		int p3=0;
		int p4=0;
		int p5=0;
		int max=0;
		for(int x=5;x<20;x++) {
			for(int y=5;y<20;y++) {
				if(point[x][y]>=top1)top1=point[x][y];
				else if(point[x][y]>=top2&&point[x][y]<top1)top2=point[x][y];
				else if(point[x][y]>=top3&&point[x][y]<top2)top3=point[x][y];
				else if(point[x][y]>=top4&&point[x][y]<top3)top4=point[x][y];
				else if(point[x][y]>=top5&&point[x][y]<top4)top5=point[x][y];
			}
		}
		if(top1<=1000) {
		for(int p=5;p<20;p++) {
			for(int q=5;q<20;q++) {
				if(point[p][q]==top1&&top1times==0) {
					copy[p][q]=3;
					p1=getfinmax(copy);
					copy[p][q]=0;
					top1times=1;
				}
				else if(top2>10&&point[p][q]==top2&&top2times==0) {
					copy[p][q]=3;
					p1=getfinmax(copy);
					copy[p][q]=0;
					top2times=1;
				}
				else if(top3>15&&point[p][q]==top3&&top3times==0) {
					copy[p][q]=3;
					p1=getfinmax(copy);
					copy[p][q]=0;
					top3times=1;
				}
				else if(top4>20&&point[p][q]==top4&&top4times==0) {
					copy[p][q]=3;
					p1=getfinmax(copy);
					copy[p][q]=0;
					top4times=1;
				}
				else if(top5>25&&point[p][q]==top5&&top5times==0) {
					copy[p][q]=3;
					p1=getfinmax(copy);
					copy[p][q]=0;
					top5times=1;
				}
			}
		}
	}else {
		for(int p=5;p<20;p++) {
			for(int q=5;q<20;q++) {
				if(point[p][q]==top1&&top1times==0) {
					copy[p][q]=3;
					p1=getfinmax(copy);
					copy[p][q]=0;
					top1times=1;
				}
			}
		}
		p2=p1;
		p3=p1;
		p4=p1;
		p5=p1;
	}
		max=(p1+p2+p3+p4+p5)/5;
		return max;
	}

	private static int getfinmax(int[][] copy) {
		int[][]point=getself2(copy);
		point=getdanger2(copy,point);
		int max=0;
		for(int x=5;x<20;x++) {
			for(int y=5;y<20;y++) {
				if(point[x][y]>=max)max=point[x][y];
			}
		}
		return max;
	}

	private static int[][] getdanger2(int[][] copy, int[][] point) {
		for(int p=5;p<20;p++) {
			for(int q=5;q<20;q++) {
				
				if(copy[p][q]==0) {
					copy[p][q]=3;//如果点击这里
					int ipoint=1;
					//测试是否对敌不利
					for(int x=5;x<20;x++) {
						for(int y=5;y<20;y++) {
							if(copy[x][y]==3) {
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
									
									if(copy[x-up][y]==3) up++;
									
									if(copy[x+down][y]==3)down++;	
									
									if(copy[x][y-left]==3)left++;
									
									if(copy[x][y+right]==3)right++;
									
									if(copy[x-upleft][y-upleft]==3)upleft++;
									
									if(copy[x+downright][y+downright]==3)downright++;
									
									if(copy[x-upright][y+upright]==3)upright++;
									
									if(copy[x+downleft][y-downleft]==3)downleft++;
								}
								//如果五星连珠
								if(up+down>=6||left+right>=6||upleft+downright>=6||upright+downleft>=6) {
									ipoint+=65536;
								}
								if(x-up<5||x+down>20||y-left<5||y+right>20||x-upleft<5||x+downleft>20||y-upleft<5||y+upright>20||x-upright<5||x+downright>20||y-downleft<5||y+downright>20)ipoint-=35;
								//如果敌方四星连珠
								//看情况加分
								if(up+down==5) {
									if(copy[x-up][y]==0&&x-up>=5&&copy[x+down][y]==0&&x+down<=20) {
										 
										ipoint+=1024;
									}
									else if(copy[x+down][y]==3&&x+down<=20&&copy[x-up][y]==0&&x-up>=5) {
										 
										ipoint+=64;
									}
									else if(copy[x+down][y]==0&&x+down<=20&&copy[x-up][y]==3&&x-up>=5) {
										 
										ipoint+=64;
									}
									else if(copy[x+down][y]==0&&x+down<=20&&x-up<5) {
										 
										ipoint+=64;
									}
									else if(x+down>20&&copy[x-up][y]==0&&x-up>=5) {
										 
										ipoint+=64;
									}
								}
								if(left+right==5) {
									if(copy[x][y-left]==0&&y-left>=5&&copy[x][y+right]==0&&y+right<=20) {
										 
										ipoint+=1024;
									}
									else if(copy[x][y-left]==3&&y-left>=5&&copy[x][y+right]==0&&y+right<=20) {
										 
										ipoint+=64;
									}
									else if(copy[x][y-left]==0&&y-left>=5&&copy[x][y+right]==3&&y+right<=20) {
									
										ipoint+=64;
									}
									else if(copy[x][y-left]==0&&y-left>=5&&y+right>20) {
									
										ipoint+=64;
									}
									else if(y-left<5&&copy[x][y+right]==0&&y+right<=20) {
									
										ipoint+=64;
									}
								}
								if(upleft+downright==5) {
									if(copy[x-upleft][y-upleft]==0&&y-left>=5&&x-upleft>=5&&copy[x+downright][y+downright]==0&&y+downright<=20&&x+downright<=20) {
									
										ipoint+=1024;
									}
									else if(copy[x-upleft][y-upleft]==3&&y-left>=5&&x-upleft>=5&&copy[x+downright][y+downright]==0&&y+downright<=20&&x+downright<=20) {
									
										ipoint+=64;
									}
									else if(copy[x-upleft][y-upleft]==0&&y-left>=5&&x-upleft>=5&&copy[x+downright][y+downright]==3&&y+downright<=20&&x+downright<=20) {
									
										ipoint+=64;
									}
									else if(y-left<5&&x-upleft<5&&copy[x+downright][y+downright]==0&&y+downright<=20&&x+downright<=20) {
										
										ipoint+=64;
									}
									else if(copy[x-upleft][y-upleft]==0&&y-left>=5&&x-upleft>=5&&y+downright>20&&x+downright>20) {
										 
										ipoint+=64;
										
									}
								}
								if(downleft+upright==5) {
									if(copy[x+downleft][y-downleft]==0&&y-downleft>=5&&x+downleft<=20&&copy[x-upright][y+upright]==0&&y+upright<=20&&x-upright>=5) {
										
										ipoint+=1024;
									}
									else if(copy[x+downleft][y-downleft]==0&&y-downleft>=5&&x+downleft<=20&&copy[x-upright][y+upright]==3&&y+upright<=20&&x-upright>=5) {
										 
										ipoint+=64;
									}
									else if(copy[x+downleft][y-downleft]==3&&y-downleft>=5&&x+downleft<=20&&copy[x-upright][y+upright]==0&&y+upright<=20&&x-upright>=5) {
										 
										ipoint+=64;
									}
									else if(y-downleft<5&&x+downleft>20&&copy[x-upright][y+upright]==0&&y+upright<=20&&x-upright>=5) {
										 
										ipoint+=64;
									}
									else if(copy[x+downleft][y-downleft]==0&&y-downleft>=5&&x+downleft<=20&&y+upright>20&&x-upright<5) {
										 
										ipoint+=64;
									}

								}
								//如果敌方三星连珠
								if(up+down==4) {
									if(copy[x-up][y]==0&&x-up>=5&&copy[x+down][y]==0&&x+down<=20) {
										ipoint+=32;
									}
									else if(copy[x-up][y]==3&&x-up>=5&&copy[x+down][y]==0&&x+down<=20) {
										ipoint+=4;
									}
									else if(copy[x-up][y]==0&&x-up>=5&&copy[x+down][y]==3&&x+down<=20) {
										ipoint+=4;
									}
									else if(copy[x-up][y]==0&&x-up>=5&&x+down>20) {
										ipoint+=4;
									}
									else if(x-up<5&&copy[x+down][y]==0&&x+down<=20) {
										ipoint+=4;
									}
								}
								if(left+right==4) {
									if(copy[x][y-left]==0&&y-left>=5&&copy[x][y+right]==0&&y+right<=20) {
										ipoint+=32;
									}
									else if(copy[x][y-left]==3&&y-left>=5&&copy[x][y+right]==0&&y+right<=20) {
										ipoint+=4;
									}
									else if(copy[x][y-left]==0&&y-left>=5&&copy[x][y+right]==3&&y+right<=20) {
										ipoint+=4;
									}
									else if(y-left<5&&copy[x][y+right]==0&&y+right<=20) {
										ipoint+=4;
									}
									else if(copy[x][y-left]==0&&y-left>=5&&y+right>20) {
										ipoint+=4;
									}
								}
								if(upleft+downright==4) {
									if(copy[x-upleft][y-upleft]==0&&y-left>=5&&x-upleft>=5&&copy[x+downright][y+downright]==0&&y+downright<=20&&x+downright<=20) {
										 
										ipoint+=32;
									}
									else if(copy[x-upleft][y-upleft]==3&&y-left>=5&&x-upleft>=5&&copy[x+downright][y+downright]==0&&y+downright<=20&&x+downright<=20) {
										ipoint+=4;
									}
									else if(copy[x-upleft][y-upleft]==0&&y-left>=5&&x-upleft>=5&&copy[x+downright][y+downright]==3&&y+downright<=20&&x+downright<=20) {
										ipoint+=4;
									}
									else if(y-left<5&&x-upleft<5&&copy[x+downright][y+downright]==0&&y+downright<=20&&x+downright<=20) {
										ipoint+=4;
									}
									else if(copy[x-upleft][y-upleft]==0&&y-left>=5&&x-upleft>=5&&copy[x+downright][y+downright]==0&&y+downright>20&&x+downright>20) {
										ipoint+=4;
									}
								}
									
								if(downleft+upright==4) {
									if(copy[x+downleft][y-downleft]==0&&y-downleft>=5&&x+downleft<=20&&copy[x-upright][y+upright]==0&&y+upright<=20&&x-upright>=5) {
										 
										ipoint+=32;
									}
									else if(copy[x+downleft][y-downleft]==3&&y-downleft>=5&&x+downleft<=20&&copy[x-upright][y+upright]==0&&y+upright<=20&&x-upright>=5) {
										ipoint+=4;
									}
									else if(copy[x+downleft][y-downleft]==0&&y-downleft>=5&&x+downleft<=20&&copy[x-upright][y+upright]==3&&y+upright<=20&&x-upright>=5) {
										ipoint+=4;
									}
									else if(y-downleft<5&&x+downleft>20&&copy[x-upright][y+upright]==0&&y+upright<=20&&x-upright>=5) {
										ipoint+=4;
									}
									else if(copy[x+downleft][y-downleft]==0&&y-downleft>=5&&x+downleft<=20&&y+upright>20&&x-upright<5) {
										ipoint+=4;
									}
								}
								
								//如果敌方二星连珠
								if(up+down==3) {
									if(copy[x-up][y]==0&&x-up>=5&&copy[x+down][y]==0&&x+down<=20) {
										ipoint+=4;
									}
									else if(copy[x-up][y]==3&&x-up>=5&&copy[x+down][y]==0&&x+down<=20) {
										ipoint+=2;
									}
									else if(copy[x-up][y]==0&&x-up>=5&&copy[x+down][y]==3&&x+down<=20) {
										ipoint+=2;
									}
									else if(copy[x-up][y]==0&&x-up>=5&&x+down>20) {
										ipoint+=2;
									}
									else if(x-up<5&&copy[x+down][y]==0&&x+down<=20) {
										ipoint+=2;
									}
								}
								if(left+right==3) {
									if(copy[x][y-left]==0&&y-left>=5&&copy[x][y+right]==0&&y+right<=20) {
										ipoint+=4;
									}
									else if(copy[x][y-left]==3&&y-left>=5&&copy[x][y+right]==0&&y+right<=20) {
										ipoint+=2;
									}
									else if(copy[x][y-left]==0&&y-left>=5&&copy[x][y+right]==3&&y+right<=20) {
										ipoint+=2;
									}
									else if(y-left<5&&copy[x][y+right]==0&&y+right<=20) {
										ipoint+=2;
									}
									else if(copy[x][y-left]==0&&y-left>=5&&y+right>20) {
										ipoint+=2;
									}
								}
								if(upleft+downright==3) {
									if(copy[x-upleft][y-upleft]==0&&y-left>=5&&x-upleft>=5&&copy[x+downright][y+downright]==0&&y+downright<=20&&x+downright<=20) {
										ipoint+=4;
									}
									else if(copy[x-upleft][y-upleft]==3&&y-left>=5&&x-upleft>=5&&copy[x+downright][y+downright]==0&&y+downright<=20&&x+downright<=20) {
										ipoint+=2;
									}
									else if(copy[x-upleft][y-upleft]==0&&y-left>=5&&x-upleft>=5&&copy[x+downright][y+downright]==3&&y+downright<=20&&x+downright<=20) {
										ipoint+=2;
									}
									else if(y-left<5&&x-upleft<5&&copy[x+downright][y+downright]==0&&y+downright<=20&&x+downright<=20) {
										ipoint+=2;
									}
									else if(copy[x-upleft][y-upleft]==0&&y-left>=5&&x-upleft>=5&&copy[x+downright][y+downright]==0&&y+downright>20&&x+downright>20) {
										ipoint+=2;
									}
								}
									
								if(downleft+upright==3) {
									if(copy[x+downleft][y-downleft]==0&&y-downleft>=5&&x+downleft<=20&&copy[x-upright][y+upright]==0&&y+upright<=20&&x-upright>=5) {
										ipoint+=4;
									}
									else if(copy[x+downleft][y-downleft]==3&&y-downleft>=5&&x+downleft<=20&&copy[x-upright][y+upright]==0&&y+upright<=20&&x-upright>=5) {
										ipoint+=2;
									}
									else if(copy[x+downleft][y-downleft]==0&&y-downleft>=5&&x+downleft<=20&&copy[x-upright][y+upright]==3&&y+upright<=20&&x-upright>=5) {
										ipoint+=2;
									}
									else if(y-downleft<5&&x+downleft>20&&copy[x-upright][y+upright]==0&&y+upright<=20&&x-upright>=5) {
										ipoint+=2;
									}
									else if(copy[x+downleft][y-downleft]==0&&y-downleft>=5&&x+downleft<=20&&y+upright>20&&x-upright<5) {
										ipoint+=2;
									}
								}
							}
							
						}
					}
					point[p][q]+=ipoint;
					copy[p][q]=0;
				}
				else point[p][q]+=-666;
			}
		}
		return point;
	}

	private static int[][] getself2(int[][] copy) {
		int[][] point=new int[25][25];
		for(int p=5;p<20;p++) {
			for(int q=5;q<20;q++) {
				if(copy[p][q]==0) {
					copy[p][q]=7;//如果点击这里
					int ipoint=1;
					//计算机器人分数
					for(int x=4;x<19;x++) {
						for(int y=4;y<19;y++) {//遍历每个格子的信息
							
							if(copy[x][y]==7) {//如果发现棋子
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
									
									if(copy[x-up][y]==7) up++;
									if(copy[x+down][y]==7)down++;
									if(copy[x][y-left]==7)left++;
									if(copy[x][y+right]==7)right++;
									if(copy[x-upleft][y-upleft]==7)upleft++;
									if(copy[x+downright][y+downright]==7)downright++;
									if(copy[x-upright][y+upright]==7)upright++;
									if(copy[x+downleft][y-downleft]==7)downleft++;
								}
					
								//如果敌方五星连珠
								if(up+down>=6||left+right>=6||upleft+downright>=6||upright+downleft>=6) {
									ipoint+=65536;
								}
								if(x-up<5||x+down>20||y-left<5||y+right>20||x-upleft<5||x+downleft>20||y-upleft<5||y+upright>20||x-upright<5||x+downright>20||y-downleft<5||y+downright>20)ipoint-=35;
								//如果敌方四星连珠
								//看情况加分
								if(up+down==5) {
									if(copy[x-up][y]==0&&x-up>=4&&copy[x+down][y]==0&&x+down<=19) {
										ipoint+=1024;
									}
									else if(copy[x+down][y]==3&&x+down<=19&&copy[x-up][y]==0&&x-up>=4) {
										ipoint+=64;
									}
									else if(copy[x+down][y]==0&&x+down<=19&&copy[x-up][y]==3&&x-up>=4) {
										ipoint+=64;
									}
									else if(copy[x+down][y]==0&&x+down<=19&&x-up<4) {
										ipoint+=64;
									}
									else if(x+down>19&&copy[x-up][y]==0&&x-up>=4) {
										ipoint+=64;
									}
								}
								if(left+right==5) {
									if(copy[x][y-left]==0&&y-left>=4&&copy[x][y+right]==0&&y+right<=19) {
										ipoint+=1024;
									}
									else if(copy[x][y-left]==3&&y-left>=4&&copy[x][y+right]==0&&y+right<=19) {
										ipoint+=64;
									}
									else if(copy[x][y-left]==0&&y-left>=4&&copy[x][y+right]==3&&y+right<=19) {
										ipoint+=64;
									}
									else if(copy[x][y-left]==0&&y-left>=4&&y+right>19) {
										ipoint+=64;
									}
									else if(y-left<4&&copy[x][y+right]==0&&y+right<=19) {
										ipoint+=64;
									}
								}
								if(upleft+downright==5) {
									if(copy[x-upleft][y-upleft]==0&&y-left>=4&&x-upleft>=4&&copy[x+downright][y+downright]==0&&y+downright<=19&&x+downright<=19) {
										ipoint+=1024;
									}
									else if(copy[x-upleft][y-upleft]==3&&y-left>=4&&x-upleft>=4&&copy[x+downright][y+downright]==0&&y+downright<=19&&x+downright<=19) {
										ipoint+=64;
									}
									else if(copy[x-upleft][y-upleft]==0&&y-left>=4&&x-upleft>=4&&copy[x+downright][y+downright]==3&&y+downright<=19&&x+downright<=19) {
										ipoint+=64;
									}
									else if(y-left<4&&x-upleft<4&&copy[x+downright][y+downright]==0&&y+downright<=19&&x+downright<=19) {
										ipoint+=64;
									}
									else if(copy[x-upleft][y-upleft]==0&&y-left>=4&&x-upleft>=4&&y+downright>19&&x+downright>19) {
										ipoint+=64;
									}
								}
								if(downleft+upright==5) {
									if(copy[x+downleft][y-downleft]==0&&y-downleft>=4&&x+downleft<=19&&copy[x-upright][y+upright]==0&&y+upright<=19&&x-upright>=4) {
										ipoint+=1024;
									}
									else if(copy[x+downleft][y-downleft]==0&&y-downleft>=4&&x+downleft<=19&&copy[x-upright][y+upright]==3&&y+upright<=19&&x-upright>=4) {
										ipoint+=64;
									}
									else if(copy[x+downleft][y-downleft]==3&&y-downleft>=4&&x+downleft<=19&&copy[x-upright][y+upright]==0&&y+upright<=19&&x-upright>=4) {
										ipoint+=64;
									}
									else if(y-downleft<4&&x+downleft>19&&copy[x-upright][y+upright]==0&&y+upright<=19&&x-upright>=4) {
										ipoint+=64;
									}
									else if(copy[x+downleft][y-downleft]==0&&y-downleft>=4&&x+downleft<=19&&y+upright>19&&x-upright<4) {
										ipoint+=64;
									}

								}
								//如果敌方三星连珠
								if(up+down==4) {
									if(copy[x-up][y]==0&&x-up>=4&&copy[x+down][y]==0&&x+down<=19) {
										ipoint+=32;
									}
									else if(copy[x-up][y]==3&&x-up>=4&&copy[x+down][y]==0&&x+down<=19) {
										ipoint+=4;
									}
									else if(copy[x-up][y]==0&&x-up>=4&&copy[x+down][y]==3&&x+down<=19) {
										ipoint+=4;
									}
									else if(copy[x-up][y]==0&&x-up>=4&&x+down>19) {
										ipoint+=4;
									}
									else if(x-up<4&&copy[x+down][y]==0&&x+down<=19) {
										ipoint+=4;
									}
								}
								if(left+right==4) {
									if(copy[x][y-left]==0&&y-left>=4&&copy[x][y+right]==0&&y+right<=19) {
										ipoint+=32;
									}
									else if(copy[x][y-left]==3&&y-left>=4&&copy[x][y+right]==0&&y+right<=19) {
										ipoint+=4;
									}
									else if(copy[x][y-left]==0&&y-left>=4&&copy[x][y+right]==3&&y+right<=19) {
										ipoint+=4;
									}
									else if(y-left<4&&copy[x][y+right]==0&&y+right<=19) {
										ipoint+=4;
									}
									else if(copy[x][y-left]==0&&y-left>=4&&y+right>19) {
										ipoint+=4;
									}
								}
								if(upleft+downright==4) {
									if(copy[x-upleft][y-upleft]==0&&y-left>=4&&x-upleft>=4&&copy[x+downright][y+downright]==0&&y+downright<=19&&x+downright<=19) {
										ipoint+=32;
									}
									else if(copy[x-upleft][y-upleft]==3&&y-left>=4&&x-upleft>=4&&copy[x+downright][y+downright]==0&&y+downright<=19&&x+downright<=19) {
										ipoint+=4;
									}
									else if(copy[x-upleft][y-upleft]==0&&y-left>=4&&x-upleft>=4&&copy[x+downright][y+downright]==3&&y+downright<=19&&x+downright<=19) {
										ipoint+=4;
									}
									else if(y-left<4&&x-upleft<4&&copy[x+downright][y+downright]==0&&y+downright<=19&&x+downright<=19) {
										ipoint+=4;
									}
									else if(copy[x-upleft][y-upleft]==0&&y-left>=4&&x-upleft>=4&&copy[x+downright][y+downright]==0&&y+downright>19&&x+downright>19) {
										ipoint+=4;
									}
								}
									
								if(downleft+upright==4) {
									if(copy[x+downleft][y-downleft]==0&&y-downleft>=4&&x+downleft<=19&&copy[x-upright][y+upright]==0&&y+upright<=19&&x-upright>=4) {
										ipoint+=32;
									}
									else if(copy[x+downleft][y-downleft]==3&&y-downleft>=4&&x+downleft<=19&&copy[x-upright][y+upright]==0&&y+upright<=19&&x-upright>=4) {
										ipoint+=4;
									}
									else if(copy[x+downleft][y-downleft]==0&&y-downleft>=4&&x+downleft<=19&&copy[x-upright][y+upright]==3&&y+upright<=19&&x-upright>=4) {
										ipoint+=4;
									}
									else if(y-downleft<4&&x+downleft>19&&copy[x-upright][y+upright]==0&&y+upright<=19&&x-upright>=4) {
										ipoint+=4;
									}
									else if(copy[x+downleft][y-downleft]==0&&y-downleft>=4&&x+downleft<=19&&y+upright>19&&x-upright<4) {
										ipoint+=4;
									}
								}
								
								//如果敌方二星连珠
								if(up+down==3) {
									if(copy[x-up][y]==0&&x-up>=4&&copy[x+down][y]==0&&x+down<=19) {
										ipoint+=4;
									}
									else if(copy[x-up][y]==3&&x-up>=4&&copy[x+down][y]==0&&x+down<=19) {
										ipoint+=2;
									}
									else if(copy[x-up][y]==0&&x-up>=4&&copy[x+down][y]==3&&x+down<=19) {
										ipoint+=2;
									}
									else if(copy[x-up][y]==0&&x-up>=4&&x+down>19) {
										ipoint+=2;
									}
									else if(x-up<4&&copy[x+down][y]==0&&x+down<=19) {
										ipoint+=2;
									}
								}
								if(left+right==3) {
									if(copy[x][y-left]==0&&y-left>=4&&copy[x][y+right]==0&&y+right<=19) {
										ipoint+=4;
									}
									else if(copy[x][y-left]==3&&y-left>=4&&copy[x][y+right]==0&&y+right<=19) {
										ipoint+=2;
									}
									else if(copy[x][y-left]==0&&y-left>=4&&copy[x][y+right]==3&&y+right<=19) {
										ipoint+=2;
									}
									else if(y-left<4&&copy[x][y+right]==0&&y+right<=19) {
										ipoint+=2;
									}
									else if(copy[x][y-left]==0&&y-left>=4&&y+right>19) {
										ipoint+=2;
									}
								}
								if(upleft+downright==3) {
									if(copy[x-upleft][y-upleft]==0&&y-left>=4&&x-upleft>=4&&copy[x+downright][y+downright]==0&&y+downright<=19&&x+downright<=19) {
										ipoint+=4;
									}
									else if(copy[x-upleft][y-upleft]==3&&y-left>=4&&x-upleft>=4&&copy[x+downright][y+downright]==0&&y+downright<=19&&x+downright<=19) {
										ipoint+=2;
									}
									else if(copy[x-upleft][y-upleft]==0&&y-left>=4&&x-upleft>=4&&copy[x+downright][y+downright]==3&&y+downright<=19&&x+downright<=19) {
										ipoint+=2;
									}
									else if(y-left<4&&x-upleft<4&&copy[x+downright][y+downright]==0&&y+downright<=19&&x+downright<=19) {
										ipoint+=2;
									}
									else if(copy[x-upleft][y-upleft]==0&&y-left>=4&&x-upleft>=4&&copy[x+downright][y+downright]==0&&y+downright>19&&x+downright>19) {
										ipoint+=2;
									}
								}
									
								if(downleft+upright==3) {
									if(copy[x+downleft][y-downleft]==0&&y-downleft>=4&&x+downleft<=19&&copy[x-upright][y+upright]==0&&y+upright<=19&&x-upright>=4) {
										ipoint+=4;
									}
									else if(copy[x+downleft][y-downleft]==3&&y-downleft>=4&&x+downleft<=19&&copy[x-upright][y+upright]==0&&y+upright<=19&&x-upright>=4) {
										ipoint+=2;
									}
									else if(copy[x+downleft][y-downleft]==0&&y-downleft>=4&&x+downleft<=19&&copy[x-upright][y+upright]==3&&y+upright<=19&&x-upright>=4) {
										ipoint+=2;
									}
									else if(y-downleft<4&&x+downleft>19&&copy[x-upright][y+upright]==0&&y+upright<=19&&x-upright>=4) {
										ipoint+=2;
									}
									else if(copy[x+downleft][y-downleft]==0&&y-downleft>=4&&x+downleft<=19&&y+upright>19&&x-upright<4) {
										ipoint+=2;
									}
								}
			}
		}
		}
				point[p][q]=(ipoint*3)/2;
				copy[p][q]=0;}
				else point[p][q]=-99999;
			}
		}
		return point;
	}

	private static int[][] getmine() {
		int[][]point=getself();
		point=getdanger(point);
		return point;
	}

	private static int[][] getdanger(int[][] point) {
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
								if(x-up<5||x+down>20||y-left<5||y+right>20||x-upleft<5||x+downleft>20||y-upleft<5||y+upright>20||x-upright<5||x+downright>20||y-downleft<5||y+downright>20)ipoint-=35;
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
	}

	private static int[][] getself() {
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
								if(x-up<5||x+down>20||y-left<5||y+right>20||x-upleft<5||x+downleft>20||y-upleft<5||y+upright>20||x-upright<5||x+downright>20||y-downleft<5||y+downright>20)ipoint-=35;
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
				point[p][q]=(ipoint*3)/2;
				UI.systemnum[p][q]=0;}
				else point[p][q]=-99999;
			}
		}
		return point;
	}
}
