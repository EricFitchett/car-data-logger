/*
 * Copyright 2011 Jess Morgan
 *
 * This file is part of car-data-logger.
 *
 * car-data-logger is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * car-data-logger is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with car-data-logger.  If not, see <http://www.gnu.org/licenses/>.
 */
package jess.morgan.car_data_logger.decode.can.eval;

public class EvalException extends Exception {
	private static final long serialVersionUID = 3489710131003369474L;

	public EvalException() {
		super();
	}

	public EvalException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public EvalException(String arg0) {
		super(arg0);
	}

	public EvalException(Throwable arg0) {
		super(arg0);
	}
}
