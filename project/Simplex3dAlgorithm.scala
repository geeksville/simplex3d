/*
 * Simplex3d build script.
 * Copyright (C) 2011, Aleksey Nikiforov
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

import sbt._
import Keys._


object Simplex3dAlgorithm extends Build {
  
  val buildSettings = Simplex3d.buildSettings ++ Seq (
    version := "0.5-SNAPSHOT",
    startYear := Some(2010),
    licenses := Seq(("LGPLv3+", new URL("http://www.gnu.org/licenses/lgpl.html")))
  )
  
  val dataFormatFilter = new WorkingFilter("simplex3d/data/format/.*")
  val noiseFilter = new WorkingFilter("simplex3d/algorithm/noise/.*")
  val intersectionFilter = new WorkingFilter("simplex3d/algorithm/intersection/.*")
  val meshFilter = new WorkingFilter("simplex3d/algorithm/mesh/.*")
  
  
  lazy val root = Project(
    id = "algorithm",
    base = file("."),
    settings = buildSettings ++ Seq (
      target := new File("target/algorithm"),
      publish := {},
      publishLocal := {}
    )
  ) aggregate(dataFormat, noise, intersection, mesh) dependsOn(Simplex3d.dummyProjectToFixSbt)
  
  lazy val dataFormat = Project(
    id = "data-format",
    base = file("Simplex3dAlgorithm"),
    settings = buildSettings ++ Seq (
      name := "simplex3d-data-format",
      description := "Additional data formats for Data Binding API.",
      target := new File("target/algorithm/data-format"),
      includeFilter := dataFormatFilter && Simplex3d.codeFilter
    )
  ) dependsOn(Simplex3dMath.core, Simplex3dMath.double, Simplex3dData.core, Simplex3dData.double)
  
  lazy val noise = Project(
    id = "algorithm-noise",
    base = file("Simplex3dAlgorithm"),
    settings = buildSettings ++ Seq (
      name := "simplex3d-algorithm-noise",
      description := "Noise Algorithms.",
      target := new File("target/algorithm/noise"),
      includeFilter := noiseFilter && Simplex3d.codeFilter
    )
  ) dependsOn(Simplex3dMath.core, Simplex3dMath.double)
  
  lazy val intersection = Project(
    id = "algorithm-intersection",
    base = file("Simplex3dAlgorithm"),
    settings = buildSettings ++ Seq (
      name := "simplex3d-algorithm-intersection",
      description := "Intersection and Collision Algorithms.",
      target := new File("target/algorithm/intersection"),
      includeFilter := intersectionFilter && Simplex3d.codeFilter
    )
  ) dependsOn(Simplex3dMath.core, Simplex3dMath.double)
  
  lazy val mesh = Project(
    id = "algorithm-mesh",
    base = file("Simplex3dAlgorithm"),
    settings = buildSettings ++ Seq (
      name := "simplex3d-algorithm-mesh",
      description := "Algorithms to generate and work with mesh data.",
      target := new File("target/algorithm/mesh"),
      includeFilter := meshFilter && Simplex3d.codeFilter
    )
  ) dependsOn(Simplex3dMath.core, Simplex3dMath.double, Simplex3dData.core, Simplex3dData.double)
  
  
  lazy val doc = Project(
    id = "doc-algorithm",
    base = file("Simplex3dAlgorithm"),
    settings = buildSettings ++ Seq (
      target := new File("target/algorithm"),
      publish := {},
      publishLocal := {}
    )
  ) dependsOn(Simplex3dMath.core, Simplex3dMath.double, Simplex3dData.core, Simplex3dData.double)
}
