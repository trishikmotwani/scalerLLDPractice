package scaler.structural.flyweight;

public class FlyingBullet {

	
	double speed; // 8 bytes
	String direction; // 4 bytes
	Object coordinates; // 24 bytes
	Bullet bullet; // keep reference value of fixed BUllet object
	// in this way even if we have 100 flying bullets of 1 type of bullet , 
	// overall space consumed will be
	// 1 bullet ~ 2kb, 100 bullets 32 bytes * 100 ~ 3200 bytes ~ 32 kB
	// on the other hand if we have all 100 bullets having all fixed attribute then,
	// 100 * 200kb ~ 20000kb ~ 20MB 
	
}
