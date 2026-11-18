
variable "project_name" {
  description = "Name of the project"
  type        = string
  default     = "auto-dealer"
}

variable "environment" {
  description = "Deployment environment"
  type        = string
  default     = "dev"
}

variable "aws_region" {
  description = "AWS region for deployment"
  type        = string
  default     = "ap-south-1"
}

variable "vpc_cidr" {
  description = "CIDR block for the VPC"
  type        = string
  default     = "10.0.0.0/16"
}

variable "availability_zones" {
  description = "Availability zones for the VPC"
  type        = list(string)
  default     = ["ap-south-1a", "ap-south-1b"]
}

variable "db_name" {
  description = "PostgreSQL database name"
  type        = string
  default     = "auto_dealer_db"
}

variable "db_username" {
  description = "PostgreSQL database username"
  type        = string
  default     = "appuser"
}

