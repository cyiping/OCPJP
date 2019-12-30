package course.c03;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

class Deeper {
	public Number getDepth(Number n) throws IOException {
		return 10;
	}
}

class DeepA extends Deeper {
	@Override
	protected Integer getDepth(Number n) {
		return 5;
	}
}

class DeepB extends Deeper {
	@Override
	public Double getDepth(Number n) {
		return 5d;
	}
}

class DeepC extends Deeper {
	@Override
	public String getDepth(Number n) {
		return "";
	}
}

class DeepD extends Deeper {
	@Override
	public Long getDepth(int d) {
		return 5L;
	}
}

class DeepE extends Deeper {
	@Override
	public Short getDepth(Integer n) {
		return 5;
	}
}

class DeepF extends Deeper {
	@Override
	public Object getDepth(Object n) {
		return 5;
	}
}

class DeepG extends Deeper {
	@Override
	public Number getDepth(Number n) throws Exception {
		return 5;
	}
}

class DeepH extends Deeper {
	@Override
	public Number getDepth(Number n) throws FileNotFoundException {
		return 5;
	}
}

class DeepI extends Deeper {
	@Override
	public Number getDepth(Number n) throws IOException, FileNotFoundException {
		return 5;
	}
}

class DeepJ extends Deeper {
	@Override
	public Number getDepth(Number n) throws IOException, SQLException {
		return 5;
	}
}

public class TestOverride {}
