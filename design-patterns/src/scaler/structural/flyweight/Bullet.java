package scaler.structural.flyweight;

public class Bullet {
	// keep fixed attributes in bullet , such that weight is reduced of each object;
	Object image; // 2kb
//	double speed; // 8 bytes
//	String direction; // 4 bytes
//	Object coordinates; // 24 bytes
	double weight;   // 8 bytes
	double power;
	double cost;
	
}
