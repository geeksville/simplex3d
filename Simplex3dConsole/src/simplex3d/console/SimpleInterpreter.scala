/*
 * Simplex3dConsole
 * Copyright (C) 2011, Aleksey Nikiforov
 *
 * This file is part of Simplex3dConsole.
 *
 * Simplex3dConsole is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Simplex3dConsole is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package simplex3d.console

import java.io._
import java.security._
import java.util.zip._
import scala.tools.nsc._


/**
 * @author Aleksey Nikiforov (lex)
 */
class SimplexInterpreter extends SimpleInterpreter {
  interpreter.interpret(
    """
    import simplex3d.math._
    import simplex3d.math.double._
    import simplex3d.math.double.functions._
    import simplex3d.data._
    import simplex3d.data.double._
    """
  )
  flusher.flush()
  out.clear()
}

class SimpleInterpreter {
  protected val out = Utils.redirectSystemOut()
  protected val flusher = new PrintWriter(out)

  protected val interpreter = {
    val settings = new GenericRunnerSettings(out.println(_))
    settings.usejavacp.value = false
    settings.classpath.value = Utils.resolveDeps()
    new Interpreter(settings, flusher)
  }

  def interpret(code: String) :String = {
    interpreter.interpret(code)
    flusher.flush()
    val res = out.text
    out.clear()
    res
  }

  def dispose() {
    interpreter.close()
  }
}