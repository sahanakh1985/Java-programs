
public class IncrementDecrementOperators {
	public static void main(String[] args) {
		int a = 10;
		int b = a++ + ++a - a++;
		System.out.println(a);
		System.out.println(b);

		int x = 8;
		int y = x++ + ++x - x++ * ++x;
		System.out.println(x);
		System.out.println(y);

		int i = 12;
		int j = --i + i-- - --i * i++ - i-- / i--;
		System.out.println(i);
		System.out.println(j);

		int m = 13;
		int n = ++m - m++ + --m * m-- / ++m;
		System.out.println(m);
		System.out.println(n);

		int p = 10;
		int q = --p + p-- - --p * p++ - p++ / p++;
		System.out.println(p);
		System.out.println(q);

		int c = 15;
		int d = ++c + --c - c++ * c-- / c++ % c--;
		System.out.println(c);
		System.out.println(d);

		int e = 20;
		int f = --e - ++e + e-- * e++ % ++e / e--;
		System.out.println(e);
		System.out.println(f);

		int k = 8;
		int l = ++k * --k / k++ % k-- / ++k + k-- - ++k;
		System.out.println(k);
		System.out.println(l);

		int u = 3;
		int v = ++u;
		int w = u++ + v++;
		System.out.println(u);
		System.out.println(v);
		System.out.println(w);

		int r = 4;
		int s = ++r + r++ - --r;
		int t = ++s - r++ / --s % ++r;
		System.out.println(r);
		System.out.println(s);
		System.out.println(t);

	}

}
