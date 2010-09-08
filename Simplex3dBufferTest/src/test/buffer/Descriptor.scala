/*
 * Simplex3d, BufferTest package
 * Copyright (C) 2010, Simplex3d Team
 *
 * This file is part of Simplex3dBufferTest.
 *
 * Simplex3dBufferTest is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Simplex3dBufferTest is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package test.buffer

import scala.reflect._
import simplex3d.buffer._
import simplex3d.math.intm._
import simplex3d.math.floatm._
import simplex3d.math.doublem._


/**
 * @author Aleksey Nikiforov (lex)
 */
case class Descriptor[E <: MetaElement, R <: RawData](
  elementManifest: Manifest[_],
  componentManifest: Manifest[_],
  components: Int,
  rawType: Int,
  normalized: Boolean
)

object Descriptors {
  implicit val Int1SByte = Descriptor[Int1, SByte](Manifest.Int, Manifest.Int, 1, RawData.SByte, false)
  implicit val Int1UByte = Descriptor[Int1, UByte](Manifest.Int, Manifest.Int, 1, RawData.UByte, false)
  implicit val Int1SShort = Descriptor[Int1, SShort](Manifest.Int, Manifest.Int, 1, RawData.SShort, false)
  implicit val Int1UShort = Descriptor[Int1, UShort](Manifest.Int, Manifest.Int, 1, RawData.UShort, false)
  implicit val Int1SInt = Descriptor[Int1, SByte](Manifest.Int, Manifest.Int, 1, RawData.SInt, false)
  implicit val Int1UInt = Descriptor[Int1, SByte](Manifest.Int, Manifest.Int, 1, RawData.UInt, false)
  
  implicit val Vec2iSByte = Descriptor[Vec2i, SByte](Vec2i.Manifest, Manifest.Int, 2, RawData.SByte, false)
  implicit val Vec2iUByte = Descriptor[Vec2i, UByte](Vec2i.Manifest, Manifest.Int, 2, RawData.UByte, false)
  implicit val Vec2iSShort = Descriptor[Vec2i, SShort](Vec2i.Manifest, Manifest.Int, 2, RawData.SShort, false)
  implicit val Vec2iUShort = Descriptor[Vec2i, UShort](Vec2i.Manifest, Manifest.Int, 2, RawData.UShort, false)
  implicit val Vec2iSInt = Descriptor[Vec2i, SByte](Vec2i.Manifest, Manifest.Int, 2, RawData.SInt, false)
  implicit val Vec2iUInt = Descriptor[Vec2i, SByte](Vec2i.Manifest, Manifest.Int, 2, RawData.UInt, false)

  implicit val Vec3iSByte = Descriptor[Vec3i, SByte](Vec3i.Manifest, Manifest.Int, 3, RawData.SByte, false)
  implicit val Vec3iUByte = Descriptor[Vec3i, UByte](Vec3i.Manifest, Manifest.Int, 3, RawData.UByte, false)
  implicit val Vec3iSShort = Descriptor[Vec3i, SShort](Vec3i.Manifest, Manifest.Int, 3, RawData.SShort, false)
  implicit val Vec3iUShort = Descriptor[Vec3i, UShort](Vec3i.Manifest, Manifest.Int, 3, RawData.UShort, false)
  implicit val Vec3iSInt = Descriptor[Vec3i, SByte](Vec3i.Manifest, Manifest.Int, 3, RawData.SInt, false)
  implicit val Vec3iUInt = Descriptor[Vec3i, SByte](Vec3i.Manifest, Manifest.Int, 3, RawData.UInt, false)

  implicit val Vec4iSByte = Descriptor[Vec4i, SByte](Vec4i.Manifest, Manifest.Int, 4, RawData.SByte, false)
  implicit val Vec4iUByte = Descriptor[Vec4i, UByte](Vec4i.Manifest, Manifest.Int, 4, RawData.UByte, false)
  implicit val Vec4iSShort = Descriptor[Vec4i, SShort](Vec4i.Manifest, Manifest.Int, 4, RawData.SShort, false)
  implicit val Vec4iUShort = Descriptor[Vec4i, UShort](Vec4i.Manifest, Manifest.Int, 4, RawData.UShort, false)
  implicit val Vec4iSInt = Descriptor[Vec4i, SByte](Vec4i.Manifest, Manifest.Int, 4, RawData.SInt, false)
  implicit val Vec4iUInt = Descriptor[Vec4i, SByte](Vec4i.Manifest, Manifest.Int, 4, RawData.UInt, false)
  
  
  implicit val Float1SByte = Descriptor[Float1, SByte](Manifest.Float, Manifest.Float, 1, RawData.SByte, true)
  implicit val Float1UByte = Descriptor[Float1, UByte](Manifest.Float, Manifest.Float, 1, RawData.UByte, true)
  implicit val Float1SShort = Descriptor[Float1, SShort](Manifest.Float, Manifest.Float, 1, RawData.SShort, true)
  implicit val Float1UShort = Descriptor[Float1, UShort](Manifest.Float, Manifest.Float, 1, RawData.UShort, true)
  implicit val Float1SInt = Descriptor[Float1, SByte](Manifest.Float, Manifest.Float, 1, RawData.SInt, true)
  implicit val Float1UInt = Descriptor[Float1, SByte](Manifest.Float, Manifest.Float, 1, RawData.UInt, true)
  implicit val Float1HalfFloat = Descriptor[Float1, HalfFloat](Manifest.Float, Manifest.Float, 1, RawData.HalfFloat, false)
  implicit val Float1RawFloat = Descriptor[Float1, RawFloat](Manifest.Float, Manifest.Float, 1, RawData.RawFloat, false)
  
  implicit val Vec2fSByte = Descriptor[Vec2f, SByte](Vec2f.Manifest, Manifest.Float, 2, RawData.SByte, true)
  implicit val Vec2fUByte = Descriptor[Vec2f, UByte](Vec2f.Manifest, Manifest.Float, 2, RawData.UByte, true)
  implicit val Vec2fSShort = Descriptor[Vec2f, SShort](Vec2f.Manifest, Manifest.Float, 2, RawData.SShort, true)
  implicit val Vec2fUShort = Descriptor[Vec2f, UShort](Vec2f.Manifest, Manifest.Float, 2, RawData.UShort, true)
  implicit val Vec2fSInt = Descriptor[Vec2f, SByte](Vec2f.Manifest, Manifest.Float, 2, RawData.SInt, true)
  implicit val Vec2fUInt = Descriptor[Vec2f, SByte](Vec2f.Manifest, Manifest.Float, 2, RawData.UInt, true)
  implicit val Vec2fHalfFloat = Descriptor[Vec2f, HalfFloat](Vec2f.Manifest, Manifest.Float, 2, RawData.HalfFloat, false)
  implicit val Vec2fRawFloat = Descriptor[Vec2f, RawFloat](Vec2f.Manifest, Manifest.Float, 2, RawData.RawFloat, false)
  
  implicit val Vec3fSByte = Descriptor[Vec3f, SByte](Vec3f.Manifest, Manifest.Float, 3, RawData.SByte, true)
  implicit val Vec3fUByte = Descriptor[Vec3f, UByte](Vec3f.Manifest, Manifest.Float, 3, RawData.UByte, true)
  implicit val Vec3fSShort = Descriptor[Vec3f, SShort](Vec3f.Manifest, Manifest.Float, 3, RawData.SShort, true)
  implicit val Vec3fUShort = Descriptor[Vec3f, UShort](Vec3f.Manifest, Manifest.Float, 3, RawData.UShort, true)
  implicit val Vec3fSInt = Descriptor[Vec3f, SByte](Vec3f.Manifest, Manifest.Float, 3, RawData.SInt, true)
  implicit val Vec3fUInt = Descriptor[Vec3f, SByte](Vec3f.Manifest, Manifest.Float, 3, RawData.UInt, true)
  implicit val Vec3fHalfFloat = Descriptor[Vec3f, HalfFloat](Vec3f.Manifest, Manifest.Float, 3, RawData.HalfFloat, false)
  implicit val Vec3fRawFloat = Descriptor[Vec3f, RawFloat](Vec3f.Manifest, Manifest.Float, 3, RawData.RawFloat, false)
  
  implicit val Vec4fSByte = Descriptor[Vec4f, SByte](Vec4f.Manifest, Manifest.Float, 4, RawData.SByte, true)
  implicit val Vec4fUByte = Descriptor[Vec4f, UByte](Vec4f.Manifest, Manifest.Float, 4, RawData.UByte, true)
  implicit val Vec4fSShort = Descriptor[Vec4f, SShort](Vec4f.Manifest, Manifest.Float, 4, RawData.SShort, true)
  implicit val Vec4fUShort = Descriptor[Vec4f, UShort](Vec4f.Manifest, Manifest.Float, 4, RawData.UShort, true)
  implicit val Vec4fSInt = Descriptor[Vec4f, SByte](Vec4f.Manifest, Manifest.Float, 4, RawData.SInt, true)
  implicit val Vec4fUInt = Descriptor[Vec4f, SByte](Vec4f.Manifest, Manifest.Float, 4, RawData.UInt, true)
  implicit val Vec4fHalfFloat = Descriptor[Vec4f, HalfFloat](Vec4f.Manifest, Manifest.Float, 4, RawData.HalfFloat, false)
  implicit val Vec4fRawFloat = Descriptor[Vec4f, RawFloat](Vec4f.Manifest, Manifest.Float, 4, RawData.RawFloat, false)
  
  
  implicit val Double1SByte = Descriptor[Double1, SByte](Manifest.Double, Manifest.Double, 1, RawData.SByte, true)
  implicit val Double1UByte = Descriptor[Double1, UByte](Manifest.Double, Manifest.Double, 1, RawData.UByte, true)
  implicit val Double1SShort = Descriptor[Double1, SShort](Manifest.Double, Manifest.Double, 1, RawData.SShort, true)
  implicit val Double1UShort = Descriptor[Double1, UShort](Manifest.Double, Manifest.Double, 1, RawData.UShort, true)
  implicit val Double1SInt = Descriptor[Double1, SByte](Manifest.Double, Manifest.Double, 1, RawData.SInt, true)
  implicit val Double1UInt = Descriptor[Double1, SByte](Manifest.Double, Manifest.Double, 1, RawData.UInt, true)
  implicit val Double1HalfFloat = Descriptor[Double1, HalfFloat](Manifest.Double, Manifest.Double, 1, RawData.HalfFloat, false)
  implicit val Double1RawFloat = Descriptor[Double1, RawFloat](Manifest.Double, Manifest.Double, 1, RawData.RawFloat, false)
  implicit val Double1RawDouble = Descriptor[Double1, RawDouble](Manifest.Double, Manifest.Double, 1, RawData.RawDouble, false)
  
  implicit val Vec2dSByte = Descriptor[Vec2d, SByte](Vec2d.Manifest, Manifest.Double, 2, RawData.SByte, true)
  implicit val Vec2dUByte = Descriptor[Vec2d, UByte](Vec2d.Manifest, Manifest.Double, 2, RawData.UByte, true)
  implicit val Vec2dSShort = Descriptor[Vec2d, SShort](Vec2d.Manifest, Manifest.Double, 2, RawData.SShort, true)
  implicit val Vec2dUShort = Descriptor[Vec2d, UShort](Vec2d.Manifest, Manifest.Double, 2, RawData.UShort, true)
  implicit val Vec2dSInt = Descriptor[Vec2d, SByte](Vec2d.Manifest, Manifest.Double, 2, RawData.SInt, true)
  implicit val Vec2dUInt = Descriptor[Vec2d, SByte](Vec2d.Manifest, Manifest.Double, 2, RawData.UInt, true)
  implicit val Vec2dHalfFloat = Descriptor[Vec2d, HalfFloat](Vec2d.Manifest, Manifest.Double, 2, RawData.HalfFloat, false)
  implicit val Vec2dRawFloat = Descriptor[Vec2d, RawFloat](Vec2d.Manifest, Manifest.Double, 2, RawData.RawFloat, false)
  implicit val Vec2dRawDouble = Descriptor[Vec2d, RawDouble](Vec2d.Manifest, Manifest.Double, 2, RawData.RawDouble, false)
  
  implicit val Vec3dSByte = Descriptor[Vec3d, SByte](Vec3d.Manifest, Manifest.Double, 3, RawData.SByte, true)
  implicit val Vec3dUByte = Descriptor[Vec3d, UByte](Vec3d.Manifest, Manifest.Double, 3, RawData.UByte, true)
  implicit val Vec3dSShort = Descriptor[Vec3d, SShort](Vec3d.Manifest, Manifest.Double, 3, RawData.SShort, true)
  implicit val Vec3dUShort = Descriptor[Vec3d, UShort](Vec3d.Manifest, Manifest.Double, 3, RawData.UShort, true)
  implicit val Vec3dSInt = Descriptor[Vec3d, SByte](Vec3d.Manifest, Manifest.Double, 3, RawData.SInt, true)
  implicit val Vec3dUInt = Descriptor[Vec3d, SByte](Vec3d.Manifest, Manifest.Double, 3, RawData.UInt, true)
  implicit val Vec3dHalfFloat = Descriptor[Vec3d, HalfFloat](Vec3d.Manifest, Manifest.Double, 3, RawData.HalfFloat, false)
  implicit val Vec3dRawFloat = Descriptor[Vec3d, RawFloat](Vec3d.Manifest, Manifest.Double, 3, RawData.RawFloat, false)
  implicit val Vec3dRawDouble = Descriptor[Vec3d, RawDouble](Vec3d.Manifest, Manifest.Double, 3, RawData.RawDouble, false)
  
  implicit val Vec4dSByte = Descriptor[Vec4d, SByte](Vec4d.Manifest, Manifest.Double, 4, RawData.SByte, true)
  implicit val Vec4dUByte = Descriptor[Vec4d, UByte](Vec4d.Manifest, Manifest.Double, 4, RawData.UByte, true)
  implicit val Vec4dSShort = Descriptor[Vec4d, SShort](Vec4d.Manifest, Manifest.Double, 4, RawData.SShort, true)
  implicit val Vec4dUShort = Descriptor[Vec4d, UShort](Vec4d.Manifest, Manifest.Double, 4, RawData.UShort, true)
  implicit val Vec4dSInt = Descriptor[Vec4d, SByte](Vec4d.Manifest, Manifest.Double, 4, RawData.SInt, true)
  implicit val Vec4dUInt = Descriptor[Vec4d, SByte](Vec4d.Manifest, Manifest.Double, 4, RawData.UInt, true)
  implicit val Vec4dHalfFloat = Descriptor[Vec4d, HalfFloat](Vec4d.Manifest, Manifest.Double, 4, RawData.HalfFloat, false)
  implicit val Vec4dRawFloat = Descriptor[Vec4d, RawFloat](Vec4d.Manifest, Manifest.Double, 4, RawData.RawFloat, false)
  implicit val Vec4dRawDouble = Descriptor[Vec4d, RawDouble](Vec4d.Manifest, Manifest.Double, 4, RawData.RawDouble, false)
}