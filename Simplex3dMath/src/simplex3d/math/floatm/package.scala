/*
 * Simplex3d, FloatMath module
 * Copyright (C) 2009-2010, Simplex3d Team
 *
 * This file is part of Simplex3dMath.
 *
 * Simplex3dMath is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Simplex3dMath is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package simplex3d.math

import simplex3d.math.floatm.FloatMath._
import simplex3d.math.integration.property._


/**
 * @author Aleksey Nikiforov (lex)
 */
package object floatm {

  // Implicits
  implicit def intToFloatPromoter(s: Float) = new IntPromoter(s)

  implicit def extendedFloatForFloat(s: Float) = new ExtendedFloat(s)
  implicit def extendedIntForFloat(s: Int) = new ExtendedInt(s)

  implicit def vec2IntToFloat(u: AnyVec2[Int]) :ConstVec2f =
    new ConstVec2f(u.fx, u.fy)

  implicit def vec3IntToFloat(u: AnyVec3[Int]) :ConstVec3f =
    new ConstVec3f(u.fx, u.fy, u.fz)

  implicit def vec4IntToFloat(u: AnyVec4[Int]) :ConstVec4f =
    new ConstVec4f(u.fx, u.fy, u.fz, u.fw)

  // Property Implicits
  implicit def vec2fToPropValue(u: ReadVec2f) :PropertyValue[ReadVec2f] = Vec2f(u)
  implicit def vec3fToPropValue(u: ReadVec3f) :PropertyValue[ReadVec3f] = Vec3f(u)
  implicit def vec4fToPropValue(u: ReadVec4f) :PropertyValue[ReadVec4f] = Vec4f(u)
  implicit def quat4fToPropValue(u: ReadQuat4f) :PropertyValue[ReadQuat4f] = Quat4f(u)
  implicit def mat2fToPropValue(u: ReadMat2f) :PropertyValue[ReadMat2f] = Mat2f(u)
  implicit def mat2x3fToPropValue(u: ReadMat2x3f) :PropertyValue[ReadMat2x3f] = Mat2x3f(u)
  implicit def mat2x4fToPropValue(u: ReadMat2x4f) :PropertyValue[ReadMat2x4f] = Mat2x4f(u)
  implicit def mat3x2fToPropValue(u: ReadMat3x2f) :PropertyValue[ReadMat3x2f] = Mat3x2f(u)
  implicit def mat3fToPropValue(u: ReadMat3f) :PropertyValue[ReadMat3f] = Mat3f(u)
  implicit def mat3x4fToPropValue(u: ReadMat3x4f) :PropertyValue[ReadMat3x4f] = Mat3x4f(u)
  implicit def mat4x2fToPropValue(u: ReadMat4x2f) :PropertyValue[ReadMat4x2f] = Mat4x2f(u)
  implicit def mat4x3fToPropValue(u: ReadMat4x3f) :PropertyValue[ReadMat4x3f] = Mat4x3f(u)
  implicit def mat4fToPropValue(u: ReadMat4f) :PropertyValue[ReadMat4f] = Mat4f(u)

  
  // Matrix aliases
  type ReadMat2x2f = ReadMat2f
  type ConstMat2x2f = ConstMat2f
  val ConstMat2x2f = ConstMat2f
  type Mat2x2f = Mat2f
  val Mat2x2f = Mat2f

  type ReadMat3x3f = ReadMat3f
  type ConstMat3x3f = ConstMat3f
  val ConstMat3x3f = ConstMat3f
  type Mat3x3f = Mat3f
  val Mat3x3f = Mat3f

  type ReadMat4x4f = ReadMat4f
  type ConstMat4x4f = ConstMat4f
  val ConstMat4x4f = ConstMat4f
  type Mat4x4f = Mat4f
  val Mat4x4f = Mat4f

  // In and Out aliases
  type inVec2f = ReadVec2f
  type outVec2f = Vec2f with Implicits[Off]
  @inline implicit def outVec2f(u: Vec2f) = u.asInstanceOf[outVec2f]

  type inVec3f = ReadVec3f
  type outVec3f = Vec3f with Implicits[Off]
  @inline implicit def outVec3f(u: Vec3f) = u.asInstanceOf[outVec3f]

  type inVec4f = ReadVec4f
  type outVec4f = Vec4f with Implicits[Off]
  @inline implicit def outVec4f(u: Vec4f) = u.asInstanceOf[outVec4f]

  type inQuat4f = ReadQuat4f
  type outQuat4f = Quat4f with Implicits[Off]
  @inline implicit def outQuat4f(u: Quat4f) = u.asInstanceOf[outQuat4f]

  type inMat2f = ReadMat2f
  type outMat2f = Mat2f with Implicits[Off]
  @inline implicit def outMat2x2f(u: Mat2f) = u.asInstanceOf[outMat2f]

  type inMat2x3f = ReadMat2x3f
  type outMat2x3f = Mat2x3f with Implicits[Off]
  @inline implicit def outMat2x3f(u: Mat2x3f) = u.asInstanceOf[outMat2x3f]

  type inMat2x4f = ReadMat2x4f
  type outMat2x4f = Mat2x4f with Implicits[Off]
  @inline implicit def outMat2x4f(u: Mat2x4f) = u.asInstanceOf[outMat2x4f]

  type inMat3x2f = ReadMat3x2f
  type outMat3x2f = Mat3x2f with Implicits[Off]
  @inline implicit def outMat3x2f(u: Mat3x2f) = u.asInstanceOf[outMat3x2f]

  type inMat3f = ReadMat3f
  type outMat3f = Mat3f with Implicits[Off]
  @inline implicit def outMat3x3f(u: Mat3f) = u.asInstanceOf[outMat3f]

  type inMat3x4f = ReadMat3x4f
  type outMat3x4f = Mat3x4f with Implicits[Off]
  @inline implicit def outMat3x4f(u: Mat3x4f) = u.asInstanceOf[outMat3x4f]

  type inMat4x2f = ReadMat4x2f
  type outMat4x2f = Mat4x2f with Implicits[Off]
  @inline implicit def outMat4x2f(u: Mat4x2f) = u.asInstanceOf[outMat4x2f]

  type inMat4x3f = ReadMat4x3f
  type outMat4x3f = Mat4x3f with Implicits[Off]
  @inline implicit def outMat4x3f(u: Mat4x3f) = u.asInstanceOf[outMat4x3f]

  type inMat4f = ReadMat4f
  type outMat4f = Mat4f with Implicits[Off]
  @inline implicit def outMat4x4f(u: Mat4f) = u.asInstanceOf[outMat4f]

  // In and Out matrix aliases
  type inMat2x2f = inMat2f
  type outMat2x2f = outMat2f

  type inMat3x3f = inMat3f
  type outMat3x3f = outMat3f

  type inMat4x4f = inMat4f
  type outMat4x4f = outMat4f
}
